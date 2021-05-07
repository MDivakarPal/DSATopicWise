/*
https://my.newtonschool.co/playground/code/vpdfhm9jyw/

Dsa Arena question - Maximum Rectangular Area in a Histogramby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Maximum Rectangular Area in a Histogram

standard input/output: 2s/128000 kB

Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.
Input
First line contains an integer 'N' denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array. The elements of the array represents the height of the bars.

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^9
Output
Print a single line denoting the maximum rectangular area possible from the contiguous bars.
Example
Input
7
6 2 5 4 5 1 6

Output
12

Input
4
6 3 4 2

Output
9

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
    Stack <Integer> str=new Stack<>();
	int al[]=new int[n];
	int ar[]=new int[n];
    Stack <Integer> stl=new Stack<>();
    // Next smallest in left
	for(int i=0;i<n;i++)
	{
		if(!(stl.empty()))
		{
			while(a[stl.peek()]>=a[i])
			{
				stl.pop();
				if(stl.empty())
				break;
			}
		}

		if(stl.empty())
		{
         al[i]=-1;
		 stl.push(i);
		}
		else
		{
			al[i]=stl.peek();
			stl.push(i);
		}
	}


for(int i=n-1;i>=0;i--)
	{
		if(!(str.empty()))
		{
			while(a[str.peek()]>=a[i])
			{
				str.pop();
				if(str.empty())
				break;
			}
		}

		if(str.empty())
		{
         ar[i]=-1;
		 str.push(i);
		}
		else
		{
			ar[i]=str.peek();
			str.push(i);
		}
	}

//System.out.println(Arrays.toString(ar));
//System.out.println(Arrays.toString(al));

long res=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{
	boolean st=true;
	int l=al[i];
	int r=ar[i];
	if(l<0)
	{l=0;
	st=false;
	}
	if (r<0){
	r=n;
	st=false;
	}
	long ca=0;
	if(st)
	ca=a[i]*(r-l-1);
	else
   ca=a[i]*(r-l);
	if(ca>res)
	res=ca;
}

System.out.println(res);


	}
}