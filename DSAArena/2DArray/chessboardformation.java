/*
Chess Board

standard input/output: 2s/128000 kB

Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.
On his birthday, Tom has been gifted a board which is in the form an NxN grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to get a chessboard like board.
Input
First line contains an integer N, denoting the size of the board
Next N lines contains N space separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints
1 <= N <= 1000
Output
A single integer that is the minimum number of cells that Tom will have to colour to convert the given board to a chess board
*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception{
    BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(rd.readLine());
	byte c[][]=new byte[n][n];
	boolean st=true; // Start with 0 and represent a white cell
	int c1=0,c2=0;
	for(int i=0;i<n;i++)
	{
		String a[]=rd.readLine().split(" ");
		for(int j=0;j<n;j++)
		{
           c[i][j]=Byte.parseByte(a[j]);
		   if(c[i][j]==0 && st!=true)
           c1++;
		   else if(c[i][j]==1 && st!=false)
		   c1++;
		   st=!st;
		}
		if(n%2==0)
		st=!st;
	}
	
	st=false;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
           if(c[i][j]==1 && st!=false)
           c2++;
		   else if(c[i][j]==0 && st!=true)
		   c2++;
		   st=!st;
		}
		if(n%2==0)
		st=!st;
	}

	 if(c1<=c2)	
	 System.out.println(c1);
	 else
	  System.out.println(c2);

	}
}