import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception{
     BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	 int n=Integer.parseInt(rd.readLine());
	 int a[][]=new int [n][n];
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 a[i][j]=i+j;
	 }

	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<i;j++)
		 {
			 int temp=a[i][j];
			 a[i][j]=a[j][i];
			 a[j][i]=temp;
		 }
	 }
	 	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
           System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	}
}