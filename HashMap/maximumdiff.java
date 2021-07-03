/*
https://my.newtonschool.co/playground/code/8v61zemnne/


Hashing - I (Practice) - Maximum distance between the same elementsby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Maximum distance between the same elements

standard input/output: 2s/128000 kB

Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Note:- It is guaranteed that atleast one number is repeated.
Input
The first line of the input contains an integer N denoting the number of elements in the array, the next line contains N space separated integers.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 10^9
Output
For each test case in new line print the Maximum distance between two occurrences of an element
Example
Sample Input
6
1 1 2 2 2 1

Sample Output
5

Explanation:-
The index of two occurrences are:- (1, 2), (1, 6), (2, 6), (3, 4), (3, 5), (4, 5)
it can be seen that the maximum distance is between (1, 6) i. e. 5

Sample Input
5
1 1 1 1 1

Sample Output
4

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
	System.out.println(maxDiff(a,n));
	}
    
	static int maxDiff(int a[],int n)
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]))
			{
				int j=map.get(a[i]);
				int d=i-j;
				if(d>max)
				max=d;
			}
			else
			map.put(a[i],i);
		}
		return max;
	}


}