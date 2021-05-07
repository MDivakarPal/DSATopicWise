import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*Available notes are 
        1, 2,5,10,20,50,100,500,2000
        */

        System.out.println("Total required notes will be "+countMoney(n));
    }

    static int countMoney(int n)
    {
        int res=0;
        if(n>=2000)
        {
            res+=n/2000;
            n%=2000;
        }
        if(n>=500)
        {
            res+=n/500;
            n%=500;
        }
        if(n>=100)
        {
            res+=n/100;
            n%=100;
        }
        if(n>=20)
        {
            res+=n/20;
            n%=20;
        }
        if(n>=10)
        {
            res+=n/10;
            n%=10;
        }
        if(n>=5)
        {
            res+=n/5;
            n%=5;
        }
        if(n>=2)
        {
            res+=n/2;
            n%=2;
        }
        res+=n;

        return res;
    }
}