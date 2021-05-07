/*
Stock span problem is based on greatest elemnt in left.
https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stock’s price for all n days. 
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.

Example 1:

Input: 
N = 7, price[] = [100 80 60 70 60 75 85]
Output:
1 1 1 2 1 4 6
Explanation:
Traversing the given input span for 100 
will be 1, 80 is smaller than 100 so the 
span is 1, 60 is smaller than 80 so the 
span is 1, 70 is greater than 60 so the 
span is 2 and so on. Hence the output will 
be 1 1 1 2 1 4 6.
Example 2:

Input: 
N = 6, price[] = [10 4 5 90 120 80]
Output:
1 1 2 4 5 1
Explanation:
Traversing the given input span for 10 
will be 1, 4 is smaller than 10 so the 
span will be 1, 5 is greater than 4 so 
the span will be 2 and so on. Hence, the 
output will be 1 1 2 4 5 1.
User Task:
The task is to complete the function calculateSpan() which takes two parameters, an array price[] denoting the price of stocks, and an integer N denoting the size of the array and number of days. This function finds the span of stock's price for all N days and returns an array of length N denoting the span for the i-th day.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 105
1 ≤ C[i] ≤ 105

*/



import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of days");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all prices of day");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println(Arrays.toString(calculateSpan(a,n)));
    }





    public static int[] calculateSpan(int a[], int n)
    {
        // Your code here
        Stack <Integer> st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(!(st.empty()))
            {
                while(a[st.peek()]<=a[i])
                {
                    st.pop();
                    if(st.empty())
                    break;
                }
            }
            
            if(st.empty())
            {
                res[i]=i+1;
                st.push(i);
            }
            else
           { 
             res[i]=i-st.peek();
             st.push(i);
           }
        }
        
        return res;
    }
   
}