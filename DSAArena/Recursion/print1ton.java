import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        printOneToN(n);
        System.out.println("\n N to one is ");
        printNToOne(n);
    }
  

    static void printOneToN(int n)
    {
        if(n==0) // Base case
        return ;
        printOneToN(n-1);
        System.out.print(n+" "); // 5 4 3 2 1 
    }

    static void printNToOne(int n)
    {
        if(n==0)
        return ;
        System.out.print(n+" ");
        printNToOne(n-1);
    }
}
