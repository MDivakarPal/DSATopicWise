import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        long n=sc.nextLong();
        System.out.println(calculateNumber(n));
    }

    static int calculateNumber(long n)
    {
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
             if(n%i==0 && i%2==0){
             c++;
             System.out.println("i is "+i);
             }
             if((n/i)%2==0 && n%i==0){
             c++;
             System.out.println("n/i is  "+(n/i)+" i is "+i);
             }
        }
        return c;
    }
}