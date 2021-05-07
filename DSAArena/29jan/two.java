import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=Integer.toString((i+1));
        }
        //System.out.println(s);
        Arrays.sort(s);
        for(int i=0;i<n;i++)
        System.out.print(s[i]+" ");
    }
}