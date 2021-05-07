import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception {
    BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(rd.readLine());
	int a[][]=new int [n][n];
	for(int i=0;i<n;i++)
	{
		String inp[]=rd.readLine().split(" ");
		for(int j=0;j<n;j++)
			a[i][j]=Integer.parseInt(inp[j]);
	}
    int t=0,b=n-1,l=0,r=n-1,d=0;
	while(t<=b && l<=r)
    {
		if(d==0)
		{
			for(int i=t;i<=b;i++)
			System.out.print(a[i][l]+" ");
			l++;
			d=1;
		}else if(d==1)
		{
			for(int i=l;i<=r;i++)
			System.out.print(a[b][i]+" ");
			b--;
			d=2;
		}
		else if(d==2)
		{
			for(int i=b;i>=t;i--)
			System.out.print(a[i][r]+" ");
			r--;
			d=3;
		}
		else if(d==3)
		{
			for(int i=r;i>=l;i--)
			System.out.print(a[t][i]+" ");
			t++;
			d=0;
		}
	}
	}
}