/*

https://my.newtonschool.co/playground/code/qmouway34h/
standard input/output: 2s/128000 kB

Given an array A of size N containing 0's, 1's and 2's. The task is to segregate the 0's, 1's and 2's in the array as all the 0's should appear in the first part of the array, 1's should appear in middle part of the array and finally all the 2's in the remaining part of the array.

Note: Do not use inbuilt sort function. Try to solve in O(N) per test case
Input
The first line contains an integer T denoting the total number of test cases. Then T testcases follow.
Each testcases contains two lines of input. The first line denotes the size of the array N.
The second lines contains the elements of the array A separated by spaces.

Constraints:
1 <= T <= 100
1 <= N <= 100000
0 <= Ai <= 2

Sum of N for each test case does not exceed 10^5
Output
For each testcase, in a newline, print the sorted array.
Example
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
Testcase 2: For the given array input, output will be 0 0 1.

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

		a=sortZeroOneTwo(a,n);
        for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");

		System.out.println();
	}
	}

	static int[] sortZeroOneTwo(int a[], int n)
	{
          int z=0,o=0,t=n-1;
		  while(o<=t)
		  {
			  switch(a[o])
			  {
				  case 0:
				  a[o]=a[z];
				  a[z]=0;
				  z++;
				  o++;
				  break;

				  case 1:
				  o++;
				  break;

				  case 2:
				  a[o]=a[t];
				  a[t]=2;
				  t--;
				  break;
			  }
		  }

		  return a;
	}
}