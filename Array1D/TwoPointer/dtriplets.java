import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    Arrays.sort(a);
     long c=0;
     int i=0,j=2;
    while(j<n){
            if(i == j-1){
                j++;
                continue;
            }

            if((a[j] - a[i]) > p){
                i++;
            }
            else{ //(arr[j] - arr[i]) <= p
                int x = j-i;
                c += (x * (x-1))/2;
                j++;
            }
        }
        System.out.println(c);
    }
}