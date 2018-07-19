/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example:
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
*/

public class LongestConsecutive {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        
        int maxCount = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : A)
        {
            set.add(num);
        }
        Iterator<Integer> i = set.iterator();    
      
        while(!set.isEmpty())
        {    
            i = set.iterator();

            int cur = (int) i.next();
            int start = cur;
            int end = cur;
            set.remove(cur);
            boolean searching = true;
          
            while(searching)
            {
                if(!set.isEmpty() && set.contains(start - 1))
                {
                    start = start -1;
                    set.remove(start);
                }
                else if(!set.isEmpty() && set.contains(end + 1))
                {
                    end = end + 1;
                    set.remove(end);
                }
                else
                {
                    int len = end - start + 1; 
                    maxCount = Math.max(maxCount, len);
                    searching = false;
                }
            }        
        }
        return maxCount;
    }
}