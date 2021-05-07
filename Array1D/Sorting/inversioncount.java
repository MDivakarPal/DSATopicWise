import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       a=countInversion(a,0,n-1);
       System.out.println(Arrays.toString(a));
       System.out.println(invc);
       
    }

    static long invc=0;
    static int[] countInversion(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;
            countInversion(a,l,mid);
            countInversion(a,mid+1,r);
            merge(a,l,r,mid);
        }
        return a;
    }

    static void merge(int a[],int l,int r,int mid)
     {
        int n1=mid-l+1;
        int n2=r-mid;
        int l1[]=new int[n1];
        int r1[]=new int[n2];
        for(int i=0;i<n1;i++)
        l1[i]=a[i+l];
        for(int j=0;j<n2;j++)
        r1[j]=a[j+(mid+1)];

        System.out.println(Arrays.toString(l1)+" , , "+Arrays.toString(r1));
        int b[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(l1[i]<=r1[j])
            {
                b[k]=l1[i];
                i++;
                k++;
            }
            else
            {
                b[k]=r1[j];
                j++;
                // 1 5 8
                // 0 6
                invc+=n1-i;
                k++;
            }
           // k++;
        }
        
        while(i<n1)
        {
            b[k]=l1[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            b[k]=r1[j];
            j++;
            k++;
        }

       k=0;
       for(i=l;i<=r;i++)
       {
           a[i]=b[k];
           k++;
       }
      //System.out.println(Arrays.toString(b));
    //  System.out.println(k+" , , "+a.length);



     }
}