import java.io.*;

class Test
{
    public static void main(String[] args) throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in)); 
        int m=Integer.parseInt(rd.readLine());
        int n=Integer.parseInt(rd.readLine());
        int a[][][]=new int[m][n][];
        for(int i=0;i<m;i++)
        {
            String str2[]=rd.readLine().split(" ");
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(str2[j]);
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
       

    }
}


/*
   for(int i=2;i*i<=n;i++)
   {
       if(n%i==0)
       {
           if((n/i!=i))
           count+=2;
           else
           count++;
       }
   }

*/