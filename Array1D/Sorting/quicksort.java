import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size of array");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println(Arrays.toString(quickSort(a,0,n-1)));
    }
   
    static int []quickSort(int a[],int s,int e)
    {
        if(s<e)
        {
            int pi=getPivot(a,s,e);
            quickSort(a,s,pi-1);
            quickSort(a,pi+1,e);
        }

        return a;
    }

    // Partition algorithm
    static int getPivot(int a[],int s,int e)
    {
        int res=a[e];
        int j=e-1;
        while(s<=j)
        {
            if(a[s]>res)
            {
                int temp=a[s];
                a[s]=a[j];
                a[j]=temp;
                j--;
            }
            else
            s++;
        }
        a[e]=a[s];
        a[s]=res;
        return s;
    }

}