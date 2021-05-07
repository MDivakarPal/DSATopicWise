/*
Mth power or Not

standard input/output: 2s/128000 kB

Andrew loves to solve problems related to prime numbers. One of Andrew's friend has asked him to solve below problem for him.
Given two positive integers N and M, the task is to check that N is the Mth power of a prime number or not.
Input
First line of input contains testcases T. For each testcase, there will be two positive integers N and M.

Constraints :
1 <= T <= 100
2 <= N <= 10^6
1 <= M <= 10
Output
For each testcase you need to print "Yes" if N is the Mth power of a prime number otherrwise "No".
Example
Input :
2
16 4
16 3

Output:
Yes
No

Explanation :
16 is m-th (4th) power of 2, where 2 is prime.


*/





import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and power");
       int m=sc.nextInt();
       int n=sc.nextInt();
       if(checkPrimePower(m,n))
       System.out.println("Yes");
       else 
       System.out.println("No ");
    }

    static boolean checkPrimePower(int m,int n)
    {
        int p=0;
        for(int i=2;i<=Math.sqrt(m);i++)
        {
            System.out.println(i);
            if(m%i==0)
            {
                while(m%i==0 )
                {
                  p++;
                  m/=i;
                  System.out.print(m+" , ");
                }

                if(m==1 && (p)==n)
                return true;
                else 
                return false;
            }
        }

        if(m>1 && n==1)
        return true;
        else
        return false;
    }
}