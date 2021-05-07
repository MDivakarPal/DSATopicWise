/*
https://my.newtonschool.co/playground/code/cu1c8u5rik/

Save and Run Hidden Test Cases
Even-Odd seperate sorting

standard input/output: 2s/128000 kB

Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.
Input
First line of each test case contains an integer N denoting the size of the array. The next line contains N space separated values of the array.

1 <= N <= 100000
0 <= A[i] <= 100000
Output
Print the space separated values of the modified array.
Example

Sample Input
7
1 2 3 5 4 7 10

Sample Output
7 5 3 1 2 4 10


Sample Input
7
0 4 5 3 7 2 1

Sample Output
7 5 3 1 0 2 4


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
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();

    // sort array in odd and even
    int e=n-1,o=0;
    while(o<e)
    {

      if((a[e]%2)>0 && (a[o]%2)==0)
      {
        int temp=a[e];
        a[e]=a[o];
        a[o]=temp;
        e--;
        o++;
      }
      if(a[e]%2==0)
      e--;
      if(a[o]%2>0)
      o++;
  }

      int  i=0;
      while(i<n && a[i]%2!=0 )
      i++;
      o=i-1;
   //  System.out.println(Arrays.toString(a));
    a=quickSort(a,0,o,true);
    a=quickSort(a,o+1,n-1,false);

   for( i=0;i<n;i++)
   System.out.print(a[i]+" ");
	}

  static int[] quickSort(int a[],int s,int e, boolean st)
  {
    if(s<e)
    {
      int pi=0;
      if(st)
      pi=quickInDec(a,s,e);
      else
      pi=quickInInc(a,s,e);

      quickSort(a,s,pi-1,st);
      quickSort(a,pi+1,e,st);

    }

    return a;
  }

  static int quickInDec(int a[],int s,int e)
  {
    int res=a[e];
    int j=e-1;
    while(s<=j)
    {
      if(a[s]< res)
      {
        int r=a[s];
        a[s]=a[j];
        a[j]=r;
        j--;
      }
      else
      s++;
    }
    
    a[e]=a[++j];
    a[j]=res;
  return j;


  }



  static int quickInInc(int a[],int s,int e)
  {
    int res=a[e];
    int j=e-1;
    while(s<=j)
    {
      if(a[s]> res)
      {
        int r=a[s];
        a[s]=a[j];
        a[j]=r;
        j--;
      }
      else
      s++;
    }
    
    a[e]=a[s];
    a[s]=res;
  return s;


  }
}