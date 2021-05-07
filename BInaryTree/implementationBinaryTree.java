import java.util.*;
class Node
{
   Node left =null;
   Node right =null;
   int data=0;
   Node(int data)
   {
       this.data=data;
       this.left=null;
       this.right=null;
   }
}
class Pair
{
   int state=0;
   Node child=null;
   Pair(Node child,int k)
   {
       this.child=child;
       this.state=k;
   }
}


class BinaryTree
{
Node root=null;
Stack <Pair> st=new Stack<>();
int size=0;
void insertNodes(int a[])
{
    if(st.empty())
    {
        this.root=new Node(a[0]);
        this.st.push(new Pair(root,1));
    }
    int i=1;
    size++;
    while(i<a.length)
    {
       // System.out.print(i+" ");
        int k=a[i];
        Pair pp=this.st.pop();
        Node parent=pp.child;
        int st1=pp.state;
       switch(st1)
       {
        case 1:
        
            if(k!=-1)
            parent.left=new Node(k);
            else
            parent.left=null;
            pp.state+=1;
            this.st.push(pp);
            if(k!=-1){
            this.st.push(new Pair(parent.left,1));            size++;}
            i++;
            break;
        
        case 2:
        
            if(k!=-1)
            parent.right=new Node(k);
            else
            parent.right=null;
            pp.state+=1;
            this.st.push(pp);
            if(k!=-1)
            {this.st.push(new Pair(parent.right,1));size++;}
            i++;
            break;
        
     /*   case 3:
        this.st.pop();
        break;*/
    }
    }
}

void preOrderTraversral(Node root)
{
    if(root==null)
    return;
    System.out.print(root.data+" ");
    preOrderTraversral(root.left);
    preOrderTraversral(root.right);
}
void inOrderTraversral(Node root)
{
    if(root==null)
    return;
    inOrderTraversral(root.left);
    System.out.print(root.data+" ");
    inOrderTraversral(root.right);
}
void postOrderTraversral(Node root)
{
    if(root==null)
    return;

    postOrderTraversral(root.left);
    postOrderTraversral(root.right);
    System.out.print(root.data+" ");
}

void displayNode(Node root)
{
    if(root==null)
    return;
    String str="";
    str+=root.left==null? "." :root.left.data+" ";
    str+="->"+root.data+"-> ";
    str+=root.right==null? "." : root.right.data+" ";
    System.out.println(str);
    displayNode(root.left);
    displayNode(root.right);
}

// Get Maximum is Binary Tree
int getMax(Node root)
{
    if(root==null)
    return Integer.MIN_VALUE;

    int leftMax=getMax(root.left);
    int roghtMax=getMax(root.right);

    int totalMax=Math.max(root.data,Math.max(leftMax,roghtMax));
    return totalMax;
}

// Get Sum of all nodes in Binary Tree
long totalSum(Node root)
{
    if(root==null)
    return 0;

    long leftSum=totalSum(root.left);
    long rightSum=totalSum(root.right);
    long totalSumRes=root.data+leftSum+rightSum;

    return totalSumRes;
}
// Get height of Binary Tree
int getHeight(Node root)
{
    if(root==null)
    return 0;
    int leftHeight=getHeight(root.left);
    int rightHeight=getHeight(root.right);
    if(leftHeight>rightHeight)
    return leftHeight+1;
    else
    return rightHeight+1;
}


}

class Test
{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of nodes in tree");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter your tree data in preorder");
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       BinaryTree bt1=new BinaryTree();
       bt1.insertNodes(a);
       bt1.preOrderTraversral(bt1.root);
       System.out.println();
       bt1.inOrderTraversral(bt1.root);
       System.out.println();
       bt1.postOrderTraversral(bt1.root);
       System.out.println();
       bt1.displayNode(bt1.root);
       System.out.println("Size is "+bt1.size);
       System.out.println("Maximum in Binary Tree is "+bt1.getMax(bt1.root));
       System.out.println("Total sum in Binary Tree is "+bt1.totalSum(bt1.root));
       System.out.println("Total height in Binary Tree is "+bt1.getHeight(bt1.root));
   }
}