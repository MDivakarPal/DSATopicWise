import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static Set <Long> set;
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			int p=sc.nextInt();
			set=new HashSet<>();
			totalUniqueNumber(n,p);
            System.out.println(set.size());
		}
     
	}
	 static void totalUniqueNumber(long n, int p)
    {
    if(p<0)
        return;
         set.add(n);
         totalUniqueNumber((n+3),(p-1));
         totalUniqueNumber((n-3),(p-1));
         totalUniqueNumber((n*2),(p-1));
       
    }
}