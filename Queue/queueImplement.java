import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of operations");
        int n=sc.nextInt();
        QueueImplement queue =new QueueImplement(10);
        System.out.println(" 1. Add in queue \n 2. Delete from queue 3.\n Print Queue 4. Size of queue");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter operation");
            int n1=sc.nextInt();
          switch(n1)
          {  case 1:
            queue.enqueue(sc.nextInt());
            break;

            case 2:
            queue.dequeue();
            break;

            case 3:
            queue.printQueue();
            break;
            
            case 4:
            System.out.println(queue.size());
            break;
            default :
            System.out.println("Invalid operation");
        }
        }
    }

}

class QueueImplement
{
    int front=0,rear=-1;
    int capacity=40;
    int arr[];
   //9151419945  jawahar pal
   // 
   QueueImplement()
   {
       arr=new int[capacity];
   }
   QueueImplement(int c)
   {
       arr=new int[c];
       capacity=c;
   }

   void enqueue(int x)
   {
       if(((rear-front)+1)==capacity )
       {
           System.out.println("Queue is full");
       }
       else
       {
           rear=((rear-front)+1)%capacity;
           arr[rear]=x;
           
       }
   }
   
   int size()
   {
       return (rear-front)+1;
   }
   
   void dequeue()
   {
        front++;
   }

   void printQueue()
   {
       for(int i=front;i<=rear;i++)
       System.out.print(arr[i]+" ");
   }
  
}