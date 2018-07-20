/*
Given a positive integer N, print all the integers from 1 to N. But for multiples of 3 print “Fizz”
instead of the number and for the multiples of 5 print “Buzz”. 
Also for number which are multiple of 3 and 5, prints “FizzBuzz”.

Example
N = 5
Return: [1 2 Fizz 4 Buzz]

Note: Instead of printing the answer, you have to return it as list of strings.
*/

public class FizzBuzz {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= n;  i++)
        {
            if(i % 15 == 0)
            {
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                list.add("Fizz");
            }
            else if (i % 5 == 0)
            {
                list.add("Buzz");
            }
            else
            {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}