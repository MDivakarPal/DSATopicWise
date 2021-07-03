/*
Primary diagonal:- M00 M11 M22
Secondary diagonal:- M02 M11 M20
Input
The first line of input contains a single integer N, The next N lines of input contains N space-separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000
Output
Print the sum of primary and secondary diagonal separated by a space.
Example
Sample Input:-
2
1 4
2 6

Sample Output:-
7 6

Sample Input:-
3
1 4 2
1 5 7
3 8 1

Sample Output:-
7 10

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
	int ar[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
        ar[i][j]=sc.nextInt();
	}
	int s1=0,s2=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			s1+=ar[i][j];

		}
	}
	int r=0,c=n-1;
     for(int i=0;i<n;i++)
	 {
        s2+=ar[r][c];
		r++;c--;
	 }
	System.out.print(s1+" "+s2);
	}
}