/*
Palindrome [Recursive]



Palindrome is a word, phrase, or sequence that reads the same backwards as forwards. Use recursion to check if a given string is palindrome or not.
Input
User Task:
Since this is a functional problem, you don't have to worry about the input, you just have to complete the function check_Palindrome() where you will get input string, starting index of string (which is 0) and the end index of string( which is str.length-1) as argument.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10000
Output
Return true if given string is palindrome else return false
Example
Sample Input 
2
ab
aba

Sample Output
false
true


*/


static boolean check_Palindrome(String str,int s, int e) 
    { 
     if(s==e || s>e)
     return true;
     else if(str.charAt(s)!=str.charAt(e))
     return false;

     boolean res=check_Palindrome(str,s+1,e-1);
     return res;
     
    }