int findMissing(int a[])
{
    
    //8 7 10 12 11
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    long givenSum=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        max=a[i];
        else if(a[i]<min)
        min=a[i];
        givenSum+=a[i];
    }
    min--;
    long firstSum=(min(min+1))/2;
    long maxSum=(max(max+1))/2;
    maxSum-=firstSum;
    long missingNumber=maxSum-givenSum;
    // min=7 , max=12
    // 1-6 

    // sum of firts 1 to min-1 numbers =firstSum
    // sum of first 1 to max numbers  =maxSum
    // givenSum=sumofarray
    // totalsum=maxSum-firstSum;
    // missingNumber=totalSum-givenSum

}

void findFirstNon(String s)
{

}

void maxRepeatingWord(String s)
{
   // T
   String a[]=s.split(" ");
   HashMap<String,Integer> map=new HashMap<>();
   String word="";
   String word2="";
   int ac1=0;
   int ac2=0;
   for(int i=0;i><a.length;i++)
   {
     /*  if(map.containsKey(a[i]))
       {
           map.put(a[i],(map.get(a[i])+1));
       }
       aaa aaa aaa bbb bbb bbb bbb
       else
       map.put(a[i],1);*/
       map.containsKey(a[i])? map.put(a[i],(map.get(a[i])+1)): map.put(a[i],1);
       if(ac<map.get(a[i]))
       {
           ac=map.get(a[i]);
           word=a[i];
       }
       
   }
   //
   System.out.println(word+" -> "+ac);


}  

loop(Node root)
{
    /*
    1--2--3--4--5--6--9
              9-8--9--8
    set={1,2,3,4,5,6,9,8,9,,8,9}
    */
    
     Set<Node> set=new Set<>();
     while(set.add(root) || root!=null)
     root=root.next;
     System.out.println(root.data);
}