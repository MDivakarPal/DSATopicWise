/*
https://my.newtonschool.co/playground/code/7bsqn3v6nm/
Prefix Sum & Kadane's Algorithm(Practice) - Xor-Funby DIVAKAR PAL
Xor-Fun

standard input/output: 2s/128000 kB

Numbers are awesome, the xor of them is more.
You are given an array A of N natural numbers. For each A[i], you need to find the Xor Value, A[i]^A[i+1]^A[i+2]^...^A[n].

Find the sum of Xor values for each element A[i].
Input
The first line of the input contains an integer N denoting the number of elements in the array.
The next line contains N single spaced integers.

Constraints
1 <= N <= 100000
1 <= A[i] <= 1000000000
Output
Output the single integer, the sum of Xor values for each element in array.
Note:-you may need to use long long
Example
Sample Input 
5
1 2 3 4 5

Sample Output
9

Explanation
Xor values are as follows: 1, 0, 2, 1, 5 and their  sum is 9
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
			//int a=3;
			//int b=1;
			//System.out.println(a^b);
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
			for(int i=n-2;i>=0;i--)
			a[i]=a[i]^a[i+1];
			long res=0;
			for(int i=0;i<n;i++)
			res+=a[i];
		//	System.out.println(Arrays.toString(a));
			System.out.println(res);
	}
}