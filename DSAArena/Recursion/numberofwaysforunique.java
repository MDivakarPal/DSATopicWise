import java.util.*;

class Main
{
    static int count=0;
    static int s=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //    System.out.println("Enter the number");
	int t=sc.nextInt();
	while(t-- >0){
        int n=sc.nextInt();
        System.out.println((waysToNatural(n,0,0))/2);
       // s=0;
     //   count=0;
	}
    }

    static int waysToNatural(int n,int i, int c)
    {
        if(n==c)
        return 1;
        else if(c>n)
        return 0;
        int res=0;
        for(int j=i;j<=n-c;j++)
        res+=waysToNatural(n,j+1,c+j);
        return res;
    }
}