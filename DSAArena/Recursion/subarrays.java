import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        subArrays(a,new ArrayList<Integer>(),0);
    }

    static void subArrays(int a[],ArrayList<Integer> l,int i)
    {
        if(i>=a.length)
        return;
        l.add(a[i]);
        printList(l);
        subArrays(a,l,++i);
        subArrays(a,new ArrayList<Integer>(),++i);
    }

    static void printList(ArrayList<Integer> l)
    {
        for(int j=0;j<l.size();j++)
        System.out.print(l.get(j)+" ");
        System.out.println();
    }
}