import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int s1=maximum(n);
        int s2=maximum(n1);
        int s3=maximum(n2);
        int ss1=maximum2(n,s1);
        int ss2=maximum2(n1,s2);
        int ss3=maximum2(n2,s3);
        int resm=(s1+s2+s3)-(ss1+ss2+ss3);
        System.out.println(resm);
     
    }

    static int maximum(int n)
    {
        int r=Integer.MIN_VALUE;
        while(n>0)
        {
            if(r<n%10)
            r=n%10;
            n/=10;
        }
        return r;
    }
    static int maximum2(int n,int s)
    {
        int r=Integer.MIN_VALUE;
        while(n>0)
        {
            if(r<n%10 && s>n%10)
            r=n%10;
            n/=10;
        }
        if(r<0)
        return s;
        return r;
    }
}