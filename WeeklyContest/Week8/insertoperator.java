import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static boolean res=false;
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long k=sc.nextLong();
	long a[]=new long[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextLong();
	checkSum(a,1,n,a[0],k);
	if(res)
	System.out.println("YES");
	else
	System.out.println("NO");
	}

	static void checkSum(long a[], int i,int n,long currSum,long k)
	{
		if(i>=n)
		return;
		if(currSum+a[i]==k)
		res=true;
		if(currSum-a[i]==k)
		res=true;
		checkSum(a,i+1,n,currSum+a[i],k);
		checkSum(a,i+1,n,currSum-a[i],k);

	}
}