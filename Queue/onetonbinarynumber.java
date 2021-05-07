import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //

    QueueString q1=new QueueString(n);
    q1.enqueue("1");
   // q1.printRes();
    //q1.add()
    try{
    while(q1.rear<n)
    {
        String s1=q1.peekEle()+"0";
        String s2=q1.peekEle()+"1";
        if(q1.rear<n)
        q1.enqueue(s1);
        if(q1.rear<n)
        q1.enqueue(s2);
        q1.dequeue();
     //  q1.printRes();
   
    }
    }
    catch(Exception ex){
   q1.printRes();

    }
     q1.printRes();
	}

  
}

class QueueString
{
      int front=0,rear=0;
    String arr[];
   //9151419945  jawahar pal
   // 
   QueueString(int c)
   {
       arr=new String[c];
   }

   void enqueue(String x)
   {
       {

           arr[rear]=x;
                      rear++;
       }
   }
   void dequeue()
   {
        front++;
   }
   String peekEle()
   {
       return arr[front];
   }
   void printRes()
   {
       for(int i=0;i<rear;i++)
       System.out.print(arr[i]+" ");
       System.out.println();
   }

   int frontPointer()
   {
       return rear;
   }
}