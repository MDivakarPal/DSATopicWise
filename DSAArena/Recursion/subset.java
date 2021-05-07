import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
       // System.out.println(s.substring(1,s.length()));
       printSubSet(s);
       System.out.print("null");
    }
    static String l="";
    static String r="";
    static String printSubSet(String s)
    {
        // base Case Decision to terminate
        if(s.length()==0)
        return ""; // 02418 
        // Decision to include 0th character
        l=l+Character.toString(s.charAt(0))+printSubSet(s.substring(1,s.length()));
        // Decision to not include 0th character
        System.out.print(l+" , ");
        printSubSet(s.substring(1,s.length()));
        return "";
    }
}