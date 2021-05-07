/*
standard input/output: 2s/128000 kB

Given two arrays and an integer x. Calculate the minimum absolute difference between sum of pair of elements (one from each array) and the integer x.
Input
First line of input contains the length of the array N
Second line contains first array elements
Third line contains second array elements
Last line contains the value of x

Constraints:-
1<=N<=10000
1<=elements<=100000
1<=x<=100000
Output
Output a single line containing the minimum difference
Example
Sample Input:-
4
1 4 5 7
10 20 30 40
32

Sample Output:-
1

Explanation:
Required pair is 30,1.

*/



import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		b[i]=sc.nextInt();
		int k=sc.nextInt();
        Arrays.sort(b);
		Arrays.sort(a);
     	/*int ans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
	    //7 5 4 1
		//10 20 30 40
		//a[i]+b[j]-k=min
		int j=closeset(b,Math.abs(a[i]-k));
		if(ans >= Math.abs((a[i]+b[j])-k))
		ans=Math.abs((a[i]+b[j])-k);
		}

		System.out.println(ans);*/
		int ans=Integer.MAX_VALUE;
		int i=0,j=n-1;
		while(i<n &&j>=0)
		{
			if(a[i]+b[j]>k)
			{
				if(ans>(Math.abs((a[i]+b[j])-k)))
				ans=Math.abs((a[i]+b[j])-k);
				j--;
			}
			else
			{
				if(ans>=(Math.abs((a[i]+b[j])-k)))
				ans=Math.abs((a[i]+b[j])-k);
				i++;
			}
		}
		System.out.println(ans);


	}

	/*static int closeset(int b[],int k)
	{
		//10 20 30 40
		// ans=10  //diff=31-10=21
		int l=0,r=b.length-1;
		int ans=0;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if((Math.abs(k-b[m])) <= (Math.abs(k-b[ans])))
			{
				l=m+1;
				ans=m;
			}
			else 
			r=m-1;
		}

		return ans;
	}*/

}