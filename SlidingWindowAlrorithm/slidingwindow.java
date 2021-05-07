/*
Total no of subarrays if size of subarray is 'k'
=n-k+1;

*/
import java.util.*;
class Test
{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of array");
         int n=sc.nextInt();
         int a[]=new int[n];
         System.out.println("Emter your array");
         for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
         System.out.println("Enter size of subarray");
         int k=sc.nextInt();
         ArrayList <Integer> list=sumOfSubarrays(a,n,k);
         System.out.println(list);
         System.out.println("Maximum sum in given array is "+maximumInArraysList(list));
         System.out.println("Minimum sum in given array is "+minimumInArraysList(list));
     }

     static ArrayList<Integer> sumOfSubarrays(int a[],int n, int k)
     {
         ArrayList <Integer> list=new ArrayList<>();
         int c=0,sum=0,i=0;
         while(i<n)
         {
             if(c<k)
             {
              sum+=a[i];
              c++;
              i++;
             }
             else
             {
             list.add(sum);
             sum-=a[(i-k)];
             sum+=a[i];
             i++;
             }
         }
         System.out.println(i);
         list.add(sum);
         return list;
     }

          // To find maximum sum in ArrayList
     static int maximumInArraysList(ArrayList <Integer> list)
     {
         int max=list.get(0);
         for(int i=0;i<list.size();i++)
         {
               if(list.get(i)>max)
               max=list.get(i);
         }
         return max;
     }

     // To find minimum sum in ArrayList
     static int minimumInArraysList(ArrayList <Integer> list)
     {
         int max=list.get(0);
         for(int i=0;i<list.size();i++)
         {
               if(list.get(i)<max)
               max=list.get(i);
         }
         return max;
     }
}