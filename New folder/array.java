import java.util.*;
class Array {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        print1ton(10);
    }   

    static void print1ton(int n)
    {
       // Base case
       if(n==0)
       return;
       System.out.print(n+" ");
       print1ton(n-1);
    }
}
