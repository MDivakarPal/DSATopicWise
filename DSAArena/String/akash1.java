import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int res=0;
        for(int i=0;i<n;i+=2)
        res+=a[i];
        System.out.println(res);
       
      double res1=Math.sqrt(2);
      int r=(int)res1;
      if(res1==r)
      System.out.println("Yes");
      else
      System.out.println("No");
    }
}