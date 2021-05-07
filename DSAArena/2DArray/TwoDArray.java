package twodarray;
import java.util.*;

public class TwoDArray
{
  public static Scanner sc=new Scanner(System.in);
  public static void traverseTwoD(int arr[][],String msg){
    System.out.println(msg);
  for(int i=0;i<arr.length;i++)
  {
     
      for(int j=0;j<arr[i].length;j++)
      System.out.print(arr[i][j]+"\t");
      System.out.println();
  }
  }

  public static int[][] input2DArray(String msg, String msg1)
  {
      System.out.println(msg);
      int m=sc.nextInt();
      int n=sc.nextInt();
      int arr[][]=new int[m][n];
      System.out.println(msg1);
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
              arr[i][j]=sc.nextInt();
      }

      return arr;
  }

  public static int [][] input2DArrayRunTime(String msg, String msg1)
  {
          System.out.println(msg);
          int m=sc.nextInt();
         int arr[][]=new int[m][];
         for(int i=0;i<m;i++)
          {
            System.out.println(msg1+" "+i+"th row");
            int n=sc.nextInt();
            arr[i]=new int[n];
              for(int j=0;j<n;j++)
                  arr[i][j]=sc.nextInt();
          }

          return arr;
  }
}