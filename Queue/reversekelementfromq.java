static Queue<Integer> ReverseK(Queue<Integer> q, int k) { 
        //enter your code here
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<k;i++)
        {
            st.push((q.peek()));
            q.remove();
        }
        while(!(st.empty()))
        q.add(st.pop());
        
        for(int i=0;i<q.size()-k;i++)
        {
            q.add(q.peek());
            q.remove();
        }
        return q;
    }