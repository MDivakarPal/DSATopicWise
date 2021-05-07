import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int s[]=findMaxMin(a);
        System.out.println("maximum is "+s[0]+" Minimum is "+s[1]);
        System.out.println("Maximum difference is "+(s[1]-s[0]));
    }

    static int [] findMaxMin(int a[])
    {
        int n[]={Integer.MAX_VALUE,Integer.MIN_VALUE};
        for(int i=0;i<a.length;i++)
        {
            if(n[0]>a[i])
            n[0]=a[i];
            else if(a[i]>n[1])
            n[1]=a[i];
        }
        return n;
    }
}