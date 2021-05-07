import java.util.*;
class Test
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          System.out.println(n+" th fibonacci is "+fiboUsingDp(n));
    }

    static long fiboUsingDp(int n)
    {
        long a=0,b=1;
        while(--n>1)
        {
            long temp=b;
            b=a+b;
            a=temp;
        }

        return b;
    }
}