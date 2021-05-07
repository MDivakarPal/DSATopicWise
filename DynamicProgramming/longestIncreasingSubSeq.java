/*
https://my.newtonschool.co/playground/code/qfk34pu1cp/


Save and Run Hidden Test Cases
Longest Increasing Subsequence

standard input/output: 2s/128000 kB

Given a sequence A of size N, find the length of the longest increasing subsequence from the given sequence.
The longest increasing subsequence means to find a subsequence of a given sequence in which the subsequence's elements are in sorted order, lowest to highest, and in which the subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique.

Note: Duplicate numbers are not counted as increasing subsequence.
Input
The first line contains the number of test cases T, each test case follows as:- The first line contains an integer N depicting the size of the array and second line followed by the value of the array.

Constraints:
1<=T<=20
1 ≤ N ≤ 1000
0 ≤ A[i] ≤ 10000
Output
For each testcase, in a new line, print the Max length of the subsequence.
Example
Sample Input:
1
16
0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15

Sample Output:-
6

Sample Input
1
6
5 8 3 7 9 1

Sample Output
3

Explanation:
Testcase 2: Longest increasing subsequence is of size 3 with elements (there are many subsequences, but listing one of them): 5 7 9.

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
	while(t-- >0)
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();

        int maxi[]=new int[n];
		maxi[0]=1;
        for(int i=1;i<n;i++)
		{
			int m=getMaxTilli(a,maxi,n,i,a[i]);
			maxi[i]=m;
		}

		System.out.println(getMax(maxi,n));
	}
	}

	static int getMaxTilli(int a[],int maxi[],int n,int i,int k)
	{
		int m=1;
        while(i>=0)
		{
			if(a[i]<k)
			{
				if(m<maxi[i]+1)
				m=maxi[i]+1;
			}

			i--;
		}
		return m;
	}

	static int getMax(int a[],int n)
	{
		int max=a[0];
		for(int i=1;i<n;i++)
		{
             if(max<a[i])
			 max=a[i];
		}

		return max;
	}
}