import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws Exception{
    BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	String s[]=rd.readLine().split(" ");
	int m=Integer.parseInt(s[0]);
	int n=Integer.parseInt(s[1]);
	int q=Integer.parseInt(s[2]);
	int a[][]=new int[m][n];
	for(int i=0;i<m;i++)
	{
		String s1[]=rd.readLine().split(" ");
		for(int j=0;j<n;j++)
		a[i][j]=Integer.parseInt(s1[j]);
		Arrays.sort(a[i]);
	}
     
	 while(q-- >0)
	 {
		 int k=Integer.parseInt(rd.readLine());
		 boolean st=false;
		 for(int i=0;i<m;i++)
		 {
			 if(a[i][0]<=k && k<=a[i][n-1])
			 {
				 if(Arrays.binarySearch(a[i],k)>=0)
				 {
					 st=true;
					 break;
				 }
			 }
			 else
			 continue;
		 }
		 if(st)
		 System.out.println("Yes");
		 else
		 System.out.println("No");
	 }




	}
}