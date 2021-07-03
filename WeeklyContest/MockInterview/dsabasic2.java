Balaned brackets 
You are given string with brackets, you need to check if it is balanced brackets or not
{[()]} 
Yes
{[(])}
No
{{[[(())]]}}
Yes

BalanedBracket(Strint brc)
{
    Stack <Character> st=new Stack<>();
    for(int i=0;i<brc.length();i++)
    {
        if(brc.charAt(i)=='('||brc.charAt(i)=='{'||brc.charAt(i)=='[')
        st.push(brc.charAt(i));
        else
        {
            if(st.empty())
            {
                System.out.print("Not Balaned");
                return;
            }
            else
            {
              char c=brc.charAt(i);
              switch(c)
              {
                  case ')':
                  if(st.peek()=='(')
                  {
                      st.pop();
                  }
                  else
                  {
                System.out.print("Not Balaned");
                return;
                  }
                  break;

                  case '}'
                  if(st.peek()=='{')
                  {
                      st.pop();
                  }
                  else
                  {
                System.out.print("Not Balaned");
                return;
                  }
                  break;
                  
                  case ']':
                  if(st.peek()=='[')
                  {
                      st.pop();
                  }
                  else
                  {
                System.out.print("Not Balaned");
                return;
                  }
                  break;

              }
            }
        }
    }

    if(st.empty())
    System.out.print("Balaned");
    else
    System.out.print("Not Balaned)
}

Given a liked list and a key to be deleted. Delete last occurrence of key from linked. The list may have duplicates.
list: 1 --> 2 --> 3 --> 4 --> 5 --> 3 --> 4 --> NULL
value to delete = 3
1 --> 2 --> 3 --> 4 --> 5 --> 4 --> NULL

deleteLast(LinkedList head , int k)
{
Node prev=null;
Node curr=null;
Node s=head;
while(s.next!=null)
{
   if(s.next.data==k)
   {
       prev=s;
       curr=s.next;
   }
   s=s.next;
}
if(prev!=null)
{
    prev.next=curr.next;
}

}