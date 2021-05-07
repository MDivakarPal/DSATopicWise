import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        a=mergerSort(a,0,n-1);
       System.out.println(Arrays.toString(a));
        System.out.println("Inversion count is "+invc);
        //System.out.println("Inversion count is "+invc);
    }
    // Partition the array
    static long invc=0;
    static int[] mergerSort(int a[],int l,int r)
    {
        if(l<r)
        {
         int mid=l+(r-l)/2;
         mergerSort(a,l,mid);
         mergerSort(a,mid+1,r);
         merge(a,l,mid,r);
        }

        return a;
    }
    // Merge two sorted arrays
    static long invcr=0;
    static void merge(int a[],int l,int mid, int r)
    {
        // l=3 mid =6 r=9
        //
    //  int n1=mid-l+1;
     //int n2=r-mid;
      //int l1[]=new int[n1];
      //int r1[]=new int[n2];
      //copy the left array in l
     // for(int i=0;i<n1;i++)
      //l1[i]=a[i+l];
      
      //copy the right array in r
      //for(int i=0;i<n2;i++)
      //r1[i]=a[mid+1+i];
      //System.out.println(Arrays.toString(l1)+" ,"+Arrays.toString(r1));
      // Merging of arrays
      System.out.println(Arrays.toString(a));
      System.out.println("Start is "+l+" , End is "+r+" , Mid is "+mid);
      int t[]=new int[r-l+1];
      int i=l,j=mid+1,k=0;
    
      while(i<=mid && j<=r)
      {
          if(a[i]<a[j])
          {
              t[k]=a[i];
              i++;
          }
          else
          {
            t[k]=a[j];
            j++;
          }
          k++;
      }
     
      while(i<=mid)
      {
          t[k]=a[i];
          i++;
          k++;
          invcr++;
      }

      while(j<=r)
      {
          t[k]=a[j];
          j++;
          k++;
      }
      k=0;
      for( i=l;i<=r;i++)
     { a[i]=t[k];k++;}
    System.out.println(Arrays.toString(a));

    }



}