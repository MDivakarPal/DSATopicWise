import java.util.*;

class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    long  n=sc.nextLong();
    long  count=2;
        for(long i=2;(i*i)<=n;i++)
        {
            if(n%i==0)
            {
                if((n/i)!=i)
                count+=2;
                else
                count+=1;
            }
        }
/*
100 :- 1,2,50,4,25,5,20,10,100
*/
        System.out.println(count);
    }
}