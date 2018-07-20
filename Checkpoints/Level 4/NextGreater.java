/*
Given an array, find the next greater element G[i] for every element A[i] in the array. The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array.
More formally,

G[i] for an element A[i] = an element A[j] such that 
    j is minimum possible AND 
    j > i AND
    A[j] > A[i]

Elements for which no greater element exist, consider next greater element as -1.

Example:

Input : A : [4, 5, 2, 10]
Output : [5, 10, 10, -1]

Example 2:

Input : A : [3, 2, 1]
Output : [-1, -1, -1]
*/

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