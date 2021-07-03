import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++)
        pq.add(sc.nextInt());
        System.out.println(pq);
        for(int i=0;i<n;i++)
        System.out.print(pq.remove()+" ");
    }
}