import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	char c1=sc.next().charAt(0);
    if(c1=='R' || c=='R')
	System.out.print('R');
	else if(c1=='J')
	System.out.print(c);
	else if(c=='J')
    System.out.print(c1);
	else
	System.out.print('D');
	}
}