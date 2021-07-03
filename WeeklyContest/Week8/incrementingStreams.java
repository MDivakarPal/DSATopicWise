import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();

		HashMap <Long,PriorityQueue<Integer>> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			//System.out.println("i is "+i);

			if(map.containsKey(a[i]))
			{
                 PriorityQueue <Integer> pq=map.get(a[i]);
				 pq.add(i);
				 int ind=pq.remove();
				 map.put(a[i],pq);
				 a[ind]+=1;
				 if(map.containsKey(a[ind]))
				 {
                 PriorityQueue pq1=map.get(a[ind]);
				 pq1.add(ind);
				 map.put(a[ind],pq1);
				 }
				 else
				 {
				PriorityQueue <Integer> pq1=new PriorityQueue<>();
				pq1.add(ind);
				map.put(a[ind],pq1);
				}
			}
			else
			{
				PriorityQueue <Integer> pq=new PriorityQueue<>();
				pq.add(i);
				map.put(a[i],pq);
			}
		}

		for(int k=0;k<n;k++)
		System.out.print(a[k]+" ");
		System.out.println();
	}	
	
	}
}
/*
class Node
{
	Node next=null;
	int val=0;
	int size=0;
    Node head=null;
	Node last=null;
	Node(int val)
	{
		this.val=val;
	}
    Node ()
	{
		this.head=null;
	}

    void addFirst(int val)
	{
		Node temp=new Node(val);
		if(this.head==null)
		{
			this.head=temp;
			size++;
			last=head;
		}
		else
		{
			temp.next=this.head;
			this.head=temp;
			size++;
		}
	}
    
	int firstIndex(int k)
	{
         
		int i=head.val;
		this.head.val=k;
        return i;

	}

	void addLast(int k)
	{
		Node t=new Node(k);
		last.next=t;
		last=last.next;
	}
}*/