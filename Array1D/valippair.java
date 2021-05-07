/*
1. Valid Pair Sum 
Medium Accuracy: 100.0% Submissions: 1049 Points: 4
Given an array of size N, find the number of distinct pairs {a[i], a[j]} (i != j) in the array with their sum greater than 0.

Example 1:

Input: N = 3, a[] = {3, -2, 1}
Output: 2
Explanation: {3, -2}, {3, 1} are two 
possible pairs.
Example 2:

Input: N = 4, a[] = {-1, -1, -1, 0}
Output: 0
Explanation: There are no possible pairs.
Your Task:  
You don't need to read input or print anything. Complete the function ValidPair() which takes the array a[ ] and size of array N as input parameters and returns the count of such pairs.

Expected Time Complexity: O(N * Log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105 
-104  ≤ a[i] ≤ 104

*/


import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter your array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
         a[i]=sc.nextInt();

    // valid pairs for array
    // 3 -2 1
    // -2 1 3
    //-1 -1 -1 0
    //-5, -4, -3, -2, -1, 1, 2, 3, 4, 5
    // 5-4=1; (-4,5),(-3,5),(-2,5)  8
    // 4-3 = 1                      6
    // 3-2=1                        4
    // 2-1=1                        2 total 20
    // 0 , 1, 2,   3,  4,  5, 6, 7, 8, 9
    // 9-2=7
   // Arrays.sort(a);
    //int ans=0;
    Arrays.sort(a);  
      
        // Variable to store the count of pairs 
        int i=0,j=n-1;
        int ans=0;
        while(i<j)
        {
           if(a[i]+a[j]>0)
           {
               ans+=j-i;
               j--;
           }
           else
           i++;
        }
        System.out.println(ans);
    }
}