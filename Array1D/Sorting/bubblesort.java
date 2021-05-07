import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
            int c=0;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-1-i;j++)
				{
                  c++;
                  if(a[j]>a[j+1])
				  {
					  int temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
				  }
                }
             printArray(a,n);
			}

			
            System.out.println("Total comparisions "+c);
            printArray(a,n);
			System.out.println();
		}


    }
    
    static void printArray(int a[],int n)
    {
        for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
System.out.println();
    }
}