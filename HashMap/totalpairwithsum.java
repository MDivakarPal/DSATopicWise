/*
https://my.newtonschool.co/playground/code/w1w62414x8/

Find pairs with given sum

standard input/output: 2s/128000 kB

Given an array of integers, and an integer ‘K’, find the count of pairs of elements in the array whose sum is equal to 'K'.
Input
The first line of the input contains 2 space separated integers N and K denoting the size of array and the sum respectively.
The second line of the input contains N space separated integers denoting the elements of the array.

Constraints:
1 <= N <= 100000
1 <= K <= 100000
1 <= A[i] <= 100000
Output
Print the count of pairs of elements in the array whose sum is equal to the K.
Example

Sample Input:
4 6
1 5 7 1

Sample Output:
2

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
    int a[]=new int[n];
    int k=sc.nextInt();
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println(checkSum(a,n,k));
  	}

    static long checkSum(int a[],int n,int k)
    {
        HashMap<Integer ,Integer> map=new HashMap<>();
		long c=0;
        for(int i=0;i<n;i++)
        {int sum=k-a[i];
        
            if(map.containsKey(sum))
			{
				c+=map.get(sum);
		    }
            
			if(map.containsKey(a[i]))
			{
				int t=map.get(a[i])+1;
				map.put(a[i],t);
			}
			else
			map.put(a[i],1);
			        
		}
        
       return c;

    }
}