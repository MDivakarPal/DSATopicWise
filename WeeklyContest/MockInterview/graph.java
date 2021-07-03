import java.util.*;
class Test
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Graph graph=new Graph(n);
    int e1=sc.nextInt();
     for(int i=0;i< e1;i++)
     graph.addNode(sc.nextInt(),sc.nextInt());
    
    
        if(graph.cycle)
        {
            System.out.println("Yes");
        }
        else
        {
          for(int i=0;i<n;i++)
          {
              if(graph.visited[i]==0)
              graph.detectCycle(i);
              if(graph.cycle)
              System.out.println("Yes");
              else
              System.out.println("No");
          }
        }
    
     
}
}

class Graph
{
    ArrayList<Integer> g[];
    int n;
    Graph(int n)
    {
       this.n=n;
       this.g=new ArrayList[n];
       for(int i=0;i<n;i++)
       g[i]=new ArrayList<Integer>();
    }
    boolean cycle=false;
    void addNode(int s,int d)
    {
        if(s==d)
        cycle=true;
        g[s].add(d);
    }
   // boolean detectCycle(int d)
   int visited[]=new int[n];
   void detectCycle(int k)
   {
        visited[k]=1;
        for(int i=0;i<g[k].size();i++)
        {
          if(visited[g[k].get(i)]==0)
          detectCycle(visited[g[k].get(i)]);
          if(visited[g[k].get(i)]==1)
          cycle=true;
        }
        visited[k]=2;
   }
}


/*
Number of leaf nodes in binary tree
*/

static leaf=0;
void numberOfLeafNode(Tree root)
{
    if(root==null)
    return;
    if(root.left==null && root.right==null)
    leaf++;
    numberOfLeafNode(root.left);
    numberOfLeafNode(root.right);
}