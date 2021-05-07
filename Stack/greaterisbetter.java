/*
https://my.newtonschool.co/playground/code/ps5793wogc/

Save and Run Hidden Test Cases
Greater is better

standard input/output: 1s/128000 kB

Straight and Simple.
Given an array A of N integers, For each i (1 ≤ i ≤ N) your task is to find the value of x+y,
where x is the largest number less than i such that A[x]>A[i] and (A[x] is the element present at position x.)
y is the smallest number greater than i such that A[y]>A[i]
If there is no x < i such that A[x] > A[i], then take x=−1. Similarly, if there is no y>i such that A[y]>A[i], then take y=−1.
Input
First line consists of a single integer denoting N.
Second line consists of N space separated integers denoting the array A.

Constraints:
1 ≤ N ≤ 1000000
1 ≤ A[i] ≤ 10000000000
Output
Print N space separated integers, denoting x+y for each i(1 ≤ i ≤ N)

Sample Input
5
5 4 1 3 2

Sample Output
-2 0 6 1 3 

Explanation:-
For element 5:- x=-1(No element exist greater than 5 in left), y=-1 (No element exist greater than 5 in right)
For element 4:- x=1, y=-1 
For element 1:- x=2, y=4
For element 3:- x=2, y=-1
For element 2:- x=4, y=-1 

Sample Input
5
6 4 6 8 2

Sample Output
3 4 3 -2 3

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


	int left[]=new int[n];
	int right[]=new int[n];
	Stack<Integer>  st=new Stack<>();
	Stack<Integer>  str=new Stack<>();
    
	for(int i=0;i<n;i++)
	{
		if(!(st.empty()))
		{
			while(a[st.peek()]<=a[i])
			{
				st.pop();
				if(st.empty())
				break;
			}
		}
		if(st.empty())
		{
			left[i]=-1;
		    st.push(i);
		}
		else
		{
			left[i]=st.peek()+1;
			st.push(i);
		}

	}


	for(int i=n-1;i>=0;i--)
	{
		if(!(str.empty()))
		{
			while(a[str.peek()]<=a[i])
			{
				str.pop();
				if(str.empty())
				break;
			}
		}
		if(str.empty())
		{
			right[i]=-1;
		    str.push(i);
		}
		else
		{
			right[i]=str.peek()+1;
			str.push(i);
		}

	}

     //System.out.println(Arrays.toString(left));
     //System.out.println(Arrays.toString(right));
      for(int i=0;i<n;i++)
	  {
		  System.out.print((left[i]+right[i])+" ");
	  }
	}
}