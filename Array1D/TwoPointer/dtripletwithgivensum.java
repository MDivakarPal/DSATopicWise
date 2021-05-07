/*
Triplets with given sum

standard input/output: 2s/128000 kB

You are given an sorted array of distinct integers and an integer k, your task is to find the number of triplets whose sum is k
Input
First line of input contains a single integer N (length of the array)
second line contain the array elements
third line contain a single integer K

Constraint:-
1<=N<=1000
1<=elements<=100000
1<=K<=100000
Output
Output a single line containing the number of required triplets
Example
Sample Input:
6
1 2 3 4 5 6
8

Sample Output:-
2

Explanation:-
(1,2,5) , (1,3,4) are the required triplets
 



*/





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int [n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int k=sc.nextInt();
	System.out.println(tripletWithGivenSum(a,k));
	
	}

	static int tripletWithGivenSum(int a[],int p)
	{
        int c=0,n=a.length;
		for(int i=0;i<n;i++)
	    {
		int j=i+1,k=n-1;
		int sum =a[i];
		while(j<k)
		{
          if(a[j]+a[k]==(p-sum))
		  {
			  c++;
			  j++;
		  }
		  else if(a[j]+a[k]<(p-sum))
		  j++;
		  else
		  k--;
		}

	    }

		return c;
	}
}