/*
https://my.newtonschool.co/playground/code/ayonrrxb0k/

Pair Hate (Contest)

standard input/output: 2s/128000 kB

Given a string S you have to remove all pairs of identical letters, which are consecutive. If after the removal there appear new pairs, remove them as well. Repeat this untill no adjacent letter in the string is same.
Note that deleting of the consecutive identical letters can be done in any order, as any order leads to the same result.
Input
The input data consists of a single string S.

Constraints:
1 <= |S| <= 100000
S contains lowercase english letters only.
Output
Print the given string after it is processed. It is guaranteed that the result will contain at least one character.
Example

Sample Input
hhoowaaaareyyoouu

Sample Output
wre

Explanation:
First we remove "hh" then "oo" then "aa" then "yy" then "oo" then "uu" and we are left with "wre".
Now we cannot remove anything.

Sample Input:-
abcde

Sample Output:-
abcde

Sample Input:-
abcddcb

Sample Output:-
a

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
                      // Your code here
	//Scanner sc=new Scanner(System.in);
	BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	String s=rd.readLine();
	
	Stack <Character> st=new Stack<>();
	st.push(s.charAt(0));
	for(int i=1;i<s.length();i++)
	{
		if(!(st.empty())){
		if(st.peek()==s.charAt(i))
		st.pop();
		else
		st.push(s.charAt(i));
		}
		else
		st.push(s.charAt(i));
	}
    //	System.out.println(st);
    // String s1="";
   StringBuilder s1=new StringBuilder("");
  while(!(st.empty()))
  {
	  s1.append(st.pop());
  }
 // System.out.println(s1);
 for(int i=s1.length()-1;i>=0;i--)
 System.out.print(s1.charAt(i));
}
}