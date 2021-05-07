/*
Save and Run Hidden Test Cases
Strange element

standard input/output: 2s/128000 kB

An element of the matrix is called strange if its corresponding row and column contains all 1's. Given a boolean matrix is size N*M, your task is to find the number of strange elements.
Input
First line of input contains two space- separated integers N and M. Next N lines of input contain M space- separated integers depicting the values of the matrix.

Constraints:-
3 <= N, M <= 50
0 <= Matrix[][] <= 1
Output
Print the number of strange elements
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception{
   BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
   String s[]=rd.readLine().split(" ");
   int m=Integer.parseInt(s[0]);
   int n=Integer.parseInt(s[1]);
   byte a[][]=new byte[m][n];
   boolean rb[]=new boolean[m];
   boolean cb[]=new boolean[n];
   boolean st=true;
   Arrays.fill(rb,true);
   Arrays.fill(cb,true);
   for(int i=0;i<m;i++)
   {
	   String s1[]=rd.readLine().split(" ");
	   for(int j=0;j<n;j++)
	   {
       a[i][j]=Byte.parseByte(s1[j]);
	   if(a[i][j]==0)
	   {
		   rb[i]=false;
		   cb[j]=false;
		   st=false;
	   }
	   }
   }
   if(st)
   {
	   System.out.println((m*n));
	   return;
   }
   
   int c=0;
   for(int i=0;i<m;i++)
   {
	   if(rb[i])
	   {
		   for(int j=0;j<n;j++)
		   {
			   if(cb[j])
               c++;
			   else
			   continue;
		   }
	   }
	   else
	   continue;
   }

System.out.println(c);






   /* for(int i=0;i<m;i++)
   {
	 //  String s1[]=rd.readLine().split(" ");
	   for(int j=0;j<n;j++)
	   {
		   System.out.print(a[i][j]+" ");
           
       }
	   System.out.println();
   }
   for(int i=0;i<m;i++)
   System.out.print(rb[i]+" ");
   System.out.println();
   for(int i=0;i<m;i++)
   System.out.print(cb[i]+" ");
   System.out.println("\n status is "+st);
   */
	}
}