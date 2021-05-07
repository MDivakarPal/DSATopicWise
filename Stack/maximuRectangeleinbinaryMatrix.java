/*
https://my.newtonschool.co/playground/code/odrufznx0l/
sa Arena question - Max rectangleby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Max rectangle

standard input/output: 2s/128000 kB

Given a binary matrix, your task is to calculate the maximum area of rectangle formed by only 1's in it.
Input
First line contains two integers number of rows N and number of columns M.
Next N lines contain M integers with each integer being either 0 or 1

Constraints:-
1 <= N, M <=1000
Output
Print the maximum area of rectangle.
Example
Sample Input 1:
4 4 
0 1 1 0 
1 1 1 1 
1 1 1 1 
1 1 0 0

Sample Output 1:
8

Explanation
The max size rectangle is 
1 1 1 1
1 1 1 1
and its area is 4*2 = 8

Sample Input 2:-
1 4
1 1 1 1

Sample Output 2:-
4

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
	String s[]=rd.readLine().split(" ");
	int n=Integer.parseInt(s[0]);
	int m=Integer.parseInt(s[1]);
	byte a[][]=new byte[n][m];
	int res[]=new int[m];
	long maxRes=0;
	for(int i=0;i<n;i++)
	{
		String s1[]=rd.readLine().split(" ");
		for(int j=0;j<m;j++)
		{
			a[i][j]=Byte.parseByte(s1[j]);
			if(a[i][j]!=0)
			res[j]=res[j]+a[i][j];
			else
			res[j]=0;
		}
	//	System.out.println(Arrays.toString(res));
		//System.out.println(maxRect(res,m));
		if(maxRect(res,m)>maxRes)
		maxRes=maxRect(res,m);

	}
   
   //System.out.println(Arrays.toString(res));
  // System.out.println(maxRect(res,m));
System.out.println(maxRes);


	}

	static long maxRect(int a[],int n)
	{
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
//System.out.println(Arrays.toString(a));
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

//System.out.println(res);

return res;
	}
}