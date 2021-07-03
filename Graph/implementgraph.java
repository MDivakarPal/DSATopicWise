import java.util.*;
class Graph
{
    int v;
    ArrayList<Integer> graph[];
    boolean visited[];
    Graph(int v)
    {
        this.v=v;
        graph=new ArrayList[v+1];
        
        // Initialize the graph with edge list
        visited=new boolean[v+1];
        for(int i=1;i<=v;i++)
        graph[i]=new ArrayList<Integer>();


    }

    void addEdge(int source,int destination , boolean type)
    {
        // Tyepe means directed or undirected
        graph[source].add(destination);
        if(type)
        {
            // if type is true means this is a undirected graph
            graph[destination].add(source);
        }
    }
    
    void dfs(int n)
    {
             visited[n]=true;
             for(int i=0;i<graph[n].size();i++)
             {
                 if(!visited[graph[n].get(i)])
                 dfs(graph[n].get(i));
             }
             System.out.print(n+" ");
            
    }
}

class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of graph \n 1. Directed \n 2. Undirected");
        boolean type=false;
        if(sc.nextInt()==2)
        type=true;
        
        System.out.println("Enter total number of vertices ");
        int v=sc.nextInt();
        Graph g=new Graph(v);
        System.out.println("Enter total number of edges ");
        int e=sc.nextInt();
        System.out.println("Enter all edges with their vertices");
        for(int i=0;i<e;i++)
        {
            g.addEdge(sc.nextInt(),sc.nextInt(),type);
        }
       for(int i=1;i<=v;i++)
       System.out.println(g.graph[i]);
        System.out.println("Traversal if graph");
        g.dfs(4);

    }
}