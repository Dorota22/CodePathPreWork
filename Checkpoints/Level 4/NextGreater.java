public class NextGreater{
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        
        if(A == null)
        {
            return null;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(A.size() == 1)
        {
            list.add(-1);
            return list;
        }
        
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i = A.size() - 1; i >= 0; i--)
        {
            if(s.isEmpty())
            {
                list.add(0,-1);
                s.push(A.get(i));
            }
            else if(!s.isEmpty() && s.peek() > A.get(i))
            {
                int num = s.pop();
                list.add(0,num);
                s.push(num);
                s.push(A.get(i));
            }
            else if(!s.isEmpty() && s.peek() <= A.get(i))
            {
                while(!s.isEmpty() && s.peek() <= A.get(i))
                {
                    s.pop();
                    if(!s.isEmpty() && s.peek() > A.get(i))
                    {
                        int num = s.pop();
                        list.add(0, num);
                        s.push(num);
                        s.push(A.get(i));
                        break;
                    }
                }   
                if(s.isEmpty())
                {
                    list.add(0, -1);
                    s.push(A.get(i));
                }    
            }
            
        }   
        return list;
    }
}    