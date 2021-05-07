/*


*/


import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter your array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        a=insertionSort(a,n);
        System.out.println("Your sorted array using Insertion sort");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" , ");
    }

    static int[] insertionSort(int a[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int t=a[i];
            int j=i-1;
            while(j>=0 && a[j]>t)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
        }
        return a;
    }
}