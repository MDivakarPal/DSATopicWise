/*
This is solution of 0/1 knapsack problem using recursion.
*/

import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of items");
        int n=sc.nextInt();
        System.out.println("Enter the weight of knapsack");
        int w=sc.nextInt();
        System.out.println("Enter the item weight and associated value of item");
        int wt[]=new int[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
            val[i]=sc.nextInt();
        }

        System.out.println(knapsack01(wt,val,w,n));
    }

    static int knapsack01(int wt[],int val[],int w,int n)
    {
        //Base Case 
        if(n==0 || w==0)
        return 0;

        if(w>=wt[n-1])
        {
            int val1=knapsack01(wt,val,w,n-1);  
            int val2=val[n-1]+knapsack01(wt,val,w-wt[n-1],n-1);  
            //System.out.println("Val1 is "+val1+"Val2 is "+val2);
            if(val1>val2)
            return val1;
            else
            return val2;
        }
        else
        return knapsack01(wt,val,w,n-1);
    }
}