/*
https://my.newtonschool.co/playground/code/o3i0c79jpp/s

Stacks (Practice) - Infix to Postfixby DIVAKAR PAL
Run
Save and Run Hidden Test Cases
Infix to Postfix

standard input/output: 2s/128000 kB

Given an infix expression, your task is to convert it into postfix.

Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'.

See example for better understanding.
Input
The input contains a single string of infix expression.

Constraints:-
1 <= |String| <= 40
Output
Output the Postfix expression.
Example
Sample Input:-
((A-(B/C))*((A/K)-L))

Sample Output:-
ABC/-AK/L-*

Sample Input:-
A+B

Sample Output:-
AB+

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	//char op[]={'(','+','-','*',''}
	String s="(";
	s+=sc.nextLine();
	s+=")";
	String res="";
//	System.out.println(s);
	Stack <Character> st=new Stack<>();
	for(int i=0;i<s.length();i++)
	{
        if(s.charAt(i)==')'||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='^')
	    {
			char c=s.charAt(i);
			//int p=-1;
			//System.out.println(st);
			int p1=getPrecedence(c);
			//System.out.println(p1);
			if(c==')')
			{
				while(st.peek()!='(')
				res+=st.pop();
				st.pop();
			}
			else{
			if(!(st.empty()))
			{
				//System.out.println(" I am ");
			while(getPrecedence(st.peek())>=p1 && st.peek()!='(')
			{
				res+=st.pop();
				if(st.empty())
				break;
			}
			}

			st.push(c);
			}
		}
		else
		{
			char c=s.charAt(i);
			if(c=='(')
			st.push('(');
			else
			{
				res+=c;
			}
		}
	}
	System.out.println(res);
	}

	static int getPrecedence(char c)
	{
		int res=-1;
		switch(c)
		{
			case '+':
			res=1;
			break;
			case '-':
			res=1;
			break;
			case '*':
			res=2;
			break;
			case '/':
			res=2;
			break;
			case '^':
			res=3;
			break;
		}

		return res;
	}
}