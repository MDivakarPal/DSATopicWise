import java.util.*;
public class sorting
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            boolean st=true;
            for(int i=0;i<n;i++)
            { 
                a[i]=sc.nextInt();
                if(a[i]>d)
                st=false;
            }
            if(st)
            {
                System.out.println("YES");
            }
            else
            {
                //st=true;
                Arrays.sort(a);
                for(int i=0;i<n-1;i++)
                {
                    if(a[i]+a[i+1]<=d)
                    {
                        st=true;
                        break;
                    }
                }
                if(st)
                System.out.println("YES");
                else
                System.out.println("NO");
    

            }
             }
    }
}