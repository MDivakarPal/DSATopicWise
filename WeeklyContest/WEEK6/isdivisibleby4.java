/*https://my.newtonschool.co/playground/code/ywckf8uzyf/
Weekend Contest - 6 - Is product 4 divisible? (Contest)by DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Is product 4 divisible? (Contest)

standard input/output: 2s/128000 kB

You are N integers A[1], A[2],. , A[N]. You need to find whether their product is divisible by 4.
Input
The first line of input contains a single integer N.
The next line contains N singly spaced integers, A[1], A[2],. , A[N].

Constraints
1 <= N <= 10
1 <= A[i] <= 1000000000
Output
Output "YES" if the product is divisible by 4, else output "NO". (without quotes)
Example

Sample Input
5
3 5 2 5 1

Sample Output
NO

Explanation: Product = 150 and 150 is not divisible by 4.

Sample Input
4
1 3 8 2

Sample Output
YES

Explanation: Product = 48 and 48 is divisible by 4.
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long res=1;
	for(int i=0;i<n;i++)
	res*=sc.nextInt();
	if(res%4==0)
	System.out.println("YES");
	else
	System.out.println("NO");
	}
}