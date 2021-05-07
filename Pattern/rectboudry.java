import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of rectangle");
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean st=false;
        // print rows 
        for(int i=0;i<n;i++)
        {
            //print columns
            if(i==0 || i==n-1)
            st=true;
            for(int j=0;j<m;j++)
            {
            if(st)
            System.out.print("* ");
            else if(j==0 || j==m-1)
            System.out.print("* ");
            else 
            System.out.print("  ");
            }
            System.out.println();
            st=false;
        }

        
    }
}