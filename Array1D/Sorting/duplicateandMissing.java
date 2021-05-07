import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
       
        int i=0;
        while(i<n)
        {
            {
                // 6 5 3 3 4 4 
                int t=a[i];
                a[i]=a[t-1];
                a[t-1]=t;
            }
            i++;
        }
        System.out.println(Arrays.toString(a));
    }
}