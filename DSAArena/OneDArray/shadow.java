/*
Get the Shadow

standard input/output: 2s/128000 kB

Given an unsorted array A[] of size N of positive integers. One number 'a' from set {1, 2, …N} is missing and one number 'b' occurs twice in array. The task is to find the repeating and the missing.
Input
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A(1), A(2), ..., A(N) denoting the elements of the array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
1 ≤ A[i] ≤ N
Output
For each testcase, in a new line, print b, which is the repeating number, followed by a, which is the missing number, in a single line.
Example

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0)
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		long c=0;
		long sum=(n*(n+1))/2;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			c+=a[i];
		}
		int rn=0;
		for(int i=0;i<n;i++)
		{
			if(search(a,i))
			{
				rn=a[i];
				break;
			}
		}

       c=c-rn;
	   System.out.println(rn+" "+(sum-c));

	}
	}
	static boolean search(int a[],int i)
    {
        for(int j=0;j<a.length;j++)
        {
            if(a[i]==a[j] && i!=j)
            return true;
        }
        return false;
    }
}