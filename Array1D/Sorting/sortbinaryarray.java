/*
https://my.newtonschool.co/playground/code/v7rad6lcu5/
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int i=0,j=n-1;
		//int k=0;
		while(i<=j)
		{
		 /*if(a[j]==1)
		 j--;
		 if(a[i]==0)
		 i++;
		 if(a[i]==1 && a[j]==0)
		 {
			 a[i]=0;
			 a[j]=1;
			 j--;
			 i++;
		 }
		 */

		 switch (a[i])
		 {
			 case 0:
			 i++;
			 break;
			 case 1:
			 a[i]=a[j];
			 a[j]=1;
			 j--;
			 break;
		 }
		 
		}
     for( i=0;i<n;i++)
	 System.out.print(a[i]+" ");
	}
}