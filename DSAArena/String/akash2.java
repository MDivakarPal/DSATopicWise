import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int res=nextMin(a);
        for(int i=0;i<=res;i++)
        System.out.print(a[i]+" ");
      
    }

  
    static int  nextMin(int a[])
    {
        int res=0;
        for(int j=1;j<a.length;j++)
        {
            if(a[res]>a[j])
            res=j;
        }
        return res;
    }
}