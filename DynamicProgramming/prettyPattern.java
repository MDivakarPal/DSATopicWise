import java.util.*;

class Test
{
    static  int pat[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=(2*n)-1;
         pat=new int[n2][n2];
        int i=0,l=n2-1;
        while(i<=l)
        {
           addToCol(i,i,n,n2);
           addToCol(i,l,n,n2);
           addToRow(i,i+1,n,n2);
           addToRow(l,i+1,n,n2);
           i++;
           l--;
           n--;
        }

        for( i=0;i<n2;i++)
        {
            for(int j=0;j<n2;j++)
            System.out.print(pat[i][j]+"   ");
            System.out.println();
        }
    }

    static void addToCol(int i,int j,int a,int n)
    {
      //  System.out.println(" I am Cols");
        for(int k=i;k<=n-i-1;k++)
        {
            pat[k][j]=a;
        }
    }
    static void addToRow(int i,int j,int a,int n)
    {
        for(int k=j;k<=n-j-1;k++)
        {
            pat[i][k]=a;
        }
    }
}