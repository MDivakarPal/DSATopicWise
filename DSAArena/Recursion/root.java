import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and power");
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(calPower(n,p));
    }

    static double calPower(int n, int p)
    {
       /* if(p%2!=0)
        {
            n/=p;
            p--;
        }
        System.out.pri*/
        double res=0;
        if(p>=2)
        res=Math.sqrt(n);
       for(int i=p-2;i>0;i-=2)
       {   
           System.out.println(res);
           res=Math.sqrt(res);
       }
       
       return res;

    }
}