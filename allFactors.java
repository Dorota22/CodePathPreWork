/*
Given a number N, find all factors of N.

Example: N = 6 
factors = {1, 2, 3, 6}

Make sure the returned array is sorted.
*/

// Returns a sorted list of factors of n
public ArrayList<Integer> allFactors(int n) 
{
    ArrayList<Integer> list = new ArrayList<>();
    if(n == 1 || n == 0)
    {
       list.add(n);            
       return list;
    }
    for(int i = (int)Math.sqrt(n); i >= 1; i--)
    {
       if(n % i == 0)
       {
           list.add(0,i);
           if(i != Math.sqrt(n))
           {
                list.add(n/i);
            }
        }
     }
     return list;
}
