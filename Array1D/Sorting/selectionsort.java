import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Your sorted array using selection sort is ");
        a=selectionSort(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" , ");
    }

    static int[] selectionSort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int j=selectCorrect(a,i,n);
            if(j!=i){
            int t=a[j];
            a[j]=a[i];
            a[i]=t;
            }
        }
        return a;
    }
    // It returns index of correct element which can be put at ith position of array.
    // It function returns minimum element's index from i to n-1.
    static int selectCorrect(int a[], int i,int n)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[min])
            min=j;
        }
        return min;
    }
}