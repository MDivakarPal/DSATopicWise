import java.util.*;
class Edges implements Comparable<Edges>
{
    int source;
    int destination;
    int weight;

    Edges(int source, int destination)
    {
        this.source=source;
        this.destination=destination;
        this.weight=(source+destination)%1000;
    }
    public int compareTo(Edges o)
    {
        if(this.weight>o.weight)
        return 1;
        else if(this.weight<o.weight)
        return -1;
        else
        return 0;
    }

  
}

class Main
{
    static int parent[];
    static int rank[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter number of vertices and edges ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        parent=new int[n+1];
        rank=new int[n+1];
        Arrays.fill(rank,1);
        Arrays.fill(parent,-1);
        Edges e[]=new Edges[m];
        for(int i=0;i<m;i++)
        {
            e[i]=new Edges(sc.nextInt(),sc.nextInt());
        }
         
        int sum=0;
        Arrays.sort(e);
        int edg=0;
      //  for(int i=0;i<m;i++)
       // System.out.println(e[i].toString());
       for(int i=0;i<m;i++)
       {
           int p[]=findParent(e[i].source,e[i].destination);
           int pa=p[0];
           int pb=p[1];
           if(pa!=pb)
           {
               sum+=e[i].weight;
               doUnion(pa,pb);
           }
       }
       System.out.println(sum);
    }

    static int[] findParent(int a, int b)
    {
        while(parent[a]>=1)
        a=parent[a];
        int res[]=new int[2];
        res[0]=a;
        while(parent[b]>=1)
        b=parent[b];
        res[1]=b;
        return res;
    }

    static void doUnion(int a, int b)
    {
        if(rank[a]>=rank[b])
        {
            parent[b]=a;
            rank[a]=rank[a]+rank[b];
        }
        else
        {
            parent[a]=b;
            rank[b]=rank[a]+rank[b];
        }
    }
    /*static boolean detectCycle( int a,int b)
    { 
       int pa=parent[a];
       int pb=parent[b];
       if(pa==-1 && pb==-1) // Both are different set
       {
          parent[a]=a;
          parent[b]=a;
       }
       else if(pa==-1) //b is single
       {
            parent[a]=pb;
            
       }
       else if(pb==-1) //a is single
       {
            parent[b]=pa;
       }
       else if(pa!=pb)
       {
           for(int i=1;i<parent.length;i++)
           {
               if(parent[i]==pb)
               parent[i]=pa;
           }
       }
       else
       return true;

       return false;
    }
*/

}