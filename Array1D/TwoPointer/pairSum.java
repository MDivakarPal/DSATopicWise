/*
https://my.newtonschool.co/playground/code/a2sv0m48nk/

Pair Sum in Sorted Array

standard input/output: 2s/128000 kB

Given a sorted array A having N integer elements, find if there exists any pair of elements such that (A[i], A[j]) have the sum equal to X (i < j)
Input
The first line of input contains T, denoting the number of testcases. The first line of each test case contains N size of array and X. Second line contains elements of array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 100000
1 <= X <= 1000
1 <= A[i] <= 1000000
Output
For each test case you need to print "Yes" if pair exists otherwise "No".
Example
Input:
2
5 4
1 2 3 4 5
5 6
2 3 5 7 8

Output:
Yes
No
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println(existOrNot(a,n,k));
	}

	}

	static String existOrNot(int a[],int n , int k)
	{
		int i=0,j=n-1;
		while(i<j)
		{
          if((a[i]+a[j])==k)
		   return "Yes";
           if((a[i]+a[j])>k)
		   j--;
		   else
		   i++;
		}

		return "No";
	}
}