/*
https://my.newtonschool.co/playground/code/ydqvcvd3ff/

standard input/output: 2s/128000 kB

Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximise the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.
Input
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each test case contains an integer n which denotes the number of houses. Next line contains space separated numbers denoting the amount of money in each house.

1 <= T <= 100
1 <= n <= 10^4
1 <= a[i] <= 10^4
Output
For each testcase, in a newline, print an integer which denotes the maximum amount he can take home.
Example

Sample Input:
2
6
5 5 10 100 10 5
3
1 2 3

Sample Output:
110
4

Explanation:
Testcase1:
5 + 100 + 5 = 110
Testcase2:
1 + 3 = 4

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception {
                      // Your code here
	//Scanner sc=new Scanner(System.in);
	BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(rd.readLine());
	while(t-->0)
	{
		int n=Integer.parseInt(rd.readLine());
	    String s[]=rd.readLine().split(" ");
		long a=0,b=Integer.parseInt(s[0]);
		for(int i=1;i<n;i++)
		{
			long ai=Integer.parseInt(s[i]);
			long am=a;
			a=Math.max(a,b);
			b=am+ai;
		}

		System.out.println(Math.max(a,b));
	}
	}
}