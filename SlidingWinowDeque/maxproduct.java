import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException{
                      // Your code here
	BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	//Scanner sc=new Scanner(System.in);
	String s[]=rd.readLine().split(" ");
	int n=Integer.parseInt(s[0]);
	int k=Integer.parseInt(s[1]);
	long a[]=new long[n];
	s=rd.readLine().split(" ");
	for(int i=0;i<n;i++)
	a[i]=Integer.parseInt(s[i]);
	
	System.out.println(maxProduct(a,n,k));

	}

	static long maxProduct(long arr[],int n,int k)
	{
		  /* ArrayList<Long> list =new ArrayList<>();
		   int j=0,m=0;
		   for(int i=0;i<n;i++)
		   {
			   if(a[i]>=a[m])
			   m=i;
			   if((i-j)==(k-1))
			   {
				   list.add(a[m]);
				   j++;
				   if(j>=m)
				   m=j;
			   }
		   }
		   
		   //System.out.println(list);
		   long res=1;
		   for(int i=0;i<list.size();i++)
		   {
			   res=((res%1000000007)*list.get(i)%1000000007)%1000000007;
              // res=res%1000000007;
		   }
*/
	Deque<Integer> dq = new LinkedList<Integer>();
		long prod = 1;
		for(int i =0; i<k; i++){
			while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
				dq.removeLast();
			}
			dq.addLast(i);
		}

		for(int i=k; i<n; i++){
			prod = ((prod % 1000000007) * (arr[dq.peek()]%1000000007)) %1000000007;
			while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
				dq.removeLast();
			}
			//remove elements which are not part of current window
			while(!dq.isEmpty() && dq.peek() <= i-k){
				dq.removeFirst();
			}
			dq.addLast(i);
		}
		prod = ((prod % 1000000007) * (arr[dq.peek()]%1000000007)) %1000000007;
	
		   return prod;
	}
}