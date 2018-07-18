/*Print concentric rectangular pattern in a 2d matrix.
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

Example 2:

Input: A = 3.
Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 

The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.
You will be given A as an argument to the function you need to implement, and you need to return a 2D array.
*/

public class PrettyPrint {
    public ArrayList<ArrayList<Integer>> prettyPrint(int n) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();    
        int len = n * 2 - 1;
        int mainNumber = n;
       
        for(int outer = 0 ; outer <= len/2 ;  outer++)
        {
            ArrayList<Integer> row = new ArrayList<>();
            boolean mainPrinted = false;
            int number = n;
            int position = 0;
           
            while(position < len)
            {
                if(number > mainNumber && !mainPrinted)
                {
                    row.add(number);
                    position++;
                    number--;
                }
                else if(number == mainNumber)
                {
                    for(int i = 0; i < mainNumber * 2 -1; i++)
                    {
                        row.add(mainNumber);
                        position++;
                    }
                    mainNumber--;
                    mainPrinted = true;
                    if(mainNumber != n)
                    {
                        number++;
                    }    
                }
                if(mainPrinted && position < len)
                {
                    row.add(number);
                    position++;
                    number++;
                }
            }
            
            list.add(outer, row);
            if(mainNumber != 0)
            {
                list.add(list.size() - outer, row);
            }
        }
        return list;
        
    }
}
