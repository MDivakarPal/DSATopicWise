import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printStringReverse(s,0);
    }

    static void printStringReverse(String s,int i)
    {
        if(i==(s.length()))
        return;
        printStringReverse(s,++i);
        System.out.print(s.charAt(i-1));
    }
}