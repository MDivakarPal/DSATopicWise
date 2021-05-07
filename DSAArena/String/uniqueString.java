import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       // int i=uniqueCharacter(s);
        System.out.println("Total unique character is "+countUnique(s));
        System.out.println("First unique character is "+uniqueCharacterUsingArray(s));

        //hackthegame
    }

    // Basic approch using O(n^2)
    // static int s uniqueCharacter(String s)
    static int countUnique(String s)
    {
        Map<Character, Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(m.containsKey(s.charAt(i)))
            {
                m.put(s.charAt(i),(m.get(s.charAt(i))+1));
            }
            else
            m.put(s.charAt(i),1);
        }
       int c=0;
       for (Map.Entry<Character, Integer> e : m.entrySet()) 
        {
            if(e.getValue()==1)
            c++;
        }
        return c;
    }
    // First unique Character
    static int uniqueCharacter(String s)
    {
        Map<Character, Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++) // O(n)
        {
            if(m.containsKey(s.charAt(i)))
            {
                m.put(s.charAt(i),(m.get(s.charAt(i))+1));
            }
            else
            m.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++) // SO(n);
        {
            if(m.get(s.charAt(i))==1)
            return i;
        }
        return -1;
    }

    // Unique Array  

    static int uniqueCharacterUsingArray(String s)
    { 
        int a[]=new int[26];
        for(int i=0;i<s.length();i++) // O(n)
        {
            int j=s.charAt(i);
            a[j-97]+=1;
        }
        for(int i=0;i<s.length();i++) // SO(1);
        {
            int j=s.charAt(i);
            if(a[j-97]==1)
            return i;
        }
        return -1;
    }
}