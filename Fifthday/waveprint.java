import java.io.*;
class Test
{
    public static void main(String[] args) throws Exception {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter  your number of rows");
        int m=Integer.parseInt(rd.readLine());
        System.out.println("Enter your number of columns");
        int n=Integer.parseInt(rd.readLine());
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter "+(i+1)+" row ");
            String inputVal[]=rd.readLine().split(" ");
            for(int j=0;j<n;j++)
            a[i][j]=Integer.parseInt(inputVal[j]);
        }

        System.out.println("Wave print of your matrix is ");
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<m;j++)
                System.out.print(a[j][i]+" ");
            }
            else
            {
                for(int j=m-1;j>=0;j--)
                System.out.print(a[j][i]+" ");
            }
        }

    }
}