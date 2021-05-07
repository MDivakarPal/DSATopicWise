import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        double res1=(a1*a2)/2;
        double res2=(b1*b2)/2;
        if(res1>res2)
        System.out.printf("%.6f",res1);
        else
        System.out.printf("%.6f",res2);
    }
}