import java.util.*;
 class Test
 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[][]=new int[n][];
         for(int i=0;i<n;i++)
         {
             System.out.println("ENter size od col");
             int m=sc.nextInt();
             a[i]=new int[m];
             for(int j=0;j<m;j++ )
             a[i][j]=sc.nextInt();
         }

         for(int i=0;i<n;i++)
         {
             for(int j=0;j<a[i].length;j++)
             {
                 
             }
         }
     }
 }