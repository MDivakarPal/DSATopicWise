/*
https://my.newtonschool.co/playground/code/kghnug1nar/

Weekend Contest - 6 - Simple Arrangement (contest)by DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Simple Arrangement (contest)

standard input/output: 2s/128000 kB

Ready for a super simple challenge!
You are given two integers A and B. You will create a line of boys and girls in the following manner:
First A girls, then B boys, then A girls, then B boys, and so on.
You will also be given an integer N. Find the number of girls in the first N people of the row.
Input
The first and the only line of input contains 3 integers N, A, B.

Constraints
1 < N, A, B <= 10^18 (1000000000000000000)
A+B <= 10^18
Output
Output a singer integer, the number of girls in the first N people in the queue.
Example
Sample Input
8 3 4

Sample Output
4

Explanation
The arrangement will look like GGGBBBBG, where G represents girl and B represents boy.

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	//String a="1000000000000000000";
	BigInteger n=new BigInteger(sc.next());
	BigInteger a=new BigInteger(sc.next());
	BigInteger b=new BigInteger(sc.next());
	BigInteger c=a.add(b) ;
	//System.out.println(c);
	//System.out.println(d);

	BigInteger d=n.divide(c);
	BigInteger total=d.multiply(c);
	BigInteger re=n.subtract(total);
	BigInteger girl=a.multiply(d);
	if(a.compareTo(re)>=0)
	girl=girl.add(re);
	else
	girl=girl.add(a);
	System.out.println(girl);
	


	}
}