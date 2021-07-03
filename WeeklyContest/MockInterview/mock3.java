static boolean findSum(int a[],int n)
{
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<a.length;i++)
    {
         if(map.containsKey(n-a[i]))
         return true;
         else 
         map.put(a[i],0);
    }

    return false;
}

/*
hashMap=2 3
2 3 1 5 6 n=4
4-2=2
i=1 
4-3=1

i=2 
4-1=3 
3 is in hashMap so retun true;



*/

/*
Merge sorted matrix in single matrix
1 3 5
7 8 9
2 4 6

1 7 2
7 2 3 8 4
1 
*/

static ArrayList<Integer> mregeSortedMatrix(int a[][])
{
    int m=a.length;
    int n=a[0].length;
    ArrayList<Integer> list=new ArrayList<Integer>();
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
          pq.add(a[j][i]);
        }
        list.add(pq.poll());
    }

    while(!pq.isEmpty())
    list.add(pq.poll());
}

/*
1 3 5
7 8 9
2 4 6

m=3 , n=3

1 3 5 
7 8 9
2 4 6
1 3 5 7 8 9
1 2 3 4 5 6 7 8 9
*/

/*
0 0 0 1 0 0
1 1 0 1 0 0
0 1 0 1 1 0
0 0 0 0 1 0

1,3 points where i can go

1 3 --> 2 3 

*/

static long calTotalDistance(int a[][],int i , j)
{
    long res=0;
    for(;i<a.length;i++)
    {
        for(;j<a[0].length;j++)
        {
          
        }
    }
}

static long res=0;
/*
sta

*/
static boolean visited[][];
static void calsit(int a[][],int i , int j)
{
    // Base Case
    if(i<0 || i>= a.length || j>=a[0].length  || j<0 || a[i][j]==0 || a[i][j] <0)
    return;
    res++;
    a[i][j]=-1*a[i][j];
    calsit(a,i++,j);
    calsit(a,i--,j);
    calsit(a,i,j++);
    calsit(a,i,j--);
}

/*
0 0 0 1 0 0
1 1 0 1 0 0
0 1 0 1 1 0
0 0 0 0 1 0
*/

