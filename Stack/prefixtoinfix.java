/*
https://my.newtonschool.co/playground/code/rjm87m0b3z/

Save and Run Hidden Test Cases
Prefix to Infix

standard input/output: 2s/128000 kB

Given a Prefix expression, convert it into a Infix expression.

Infix : An expression is called the Infix expression if the operator appears in between the operands in the expression. Simply of the form (operand1 operator operand2).
Example : (M+N) * (O-P)

Prefix : An expression is called the prefix expression if the operator appears in the expression before the operands. Simply of the form (operator operand1 operand2).
Example : *+MN-OP (Infix : (M+N) * (O-P) )
Input
Input contains a single string of prefix expression.

Constraints:
1 < = string length < = 20

Note :- String will only contain uppercase english letters and maths operand :- '/', '*', '+', '-'.

Output
Print the Infix expression.
Sample Input
*-A/BC-/AKL

Sample Output:
((A-(B/C))*((A/K)-L))

Sample Input
+AB

Sample Output
A+B

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
/*
In prefix to Infix conversion we have to scan the inputed String fram
left to right and push the all operand in to Stack.
When ever you got any operator then you have to pop the 
top two operand and insert the operator in middle of them
and append (the resulatnt string within ()).

*/
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Stack <String> st=new Stack<>();
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)=='+'||s.charAt(i)=='*'||s.charAt(i)=='-'||s.charAt(i)=='/')
		{
            String a=st.pop();
            String b=st.pop();
			char c=s.charAt(i);
			String res="(";
			res+=a+c+b+")";
			st.push(res);
		}
		else
		{
			String s1=Character.toString(s.charAt(i));
			st.push(s1);
		}
	}

	System.out.println(st.peek());
}
}