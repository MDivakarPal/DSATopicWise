import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception{
    BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	String inp1[]=rd.readLine().split(" ");
	int m=Integer.parseInt(inp1[0]);
	int n=Integer.parseInt(inp1[1]);
	int p=Integer.parseInt(inp1[2]);
    int m1[][]=new int[m][n];
	int m2[][]=new int[n][p];
	for(int i=0;i<m;i++)
	{
		String inp[]=rd.readLine().split(" ");
		for(int j=0;j<n;j++)
		m1[i][j]=Integer.parseInt(inp[j]);
	}
   
    for(int i=0;i<n;i++)
	{
		String inp[]=rd.readLine().split(" ");
		for(int j=0;j<p;j++)
		m2[i][j]=Integer.parseInt(inp[j]);
	}
    /*
	1 2 3					1	1    2   3   4   5   6 	 
	4 5 6 						7    8   9  10   11  12
								13	14	15	16	17	18
	*/

	int m3[][]=new int[m][p];
	for(int i=0;i<m;i++)
	{
           for(int j=0;j<p;j++)
		   {
			 ///  m3[i][j]=0;
			   for(int k=0;k<n;k++){
                   m3[i][j]+=m1[i][k]*m2[k][j];
				  // 	System.out.println("i= "+m1[i][k]+" j= "+m2[k][j]+" k="+k);
			   }
		   }
	}
    for(int i=0;i<m;i++)
	{
		for(int j=0;j<p;j++)
		System.out.print(m3[i][j]+" ");
		System.out.println();
	}


	}
}