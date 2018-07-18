/*
Given a number N, verify if N is prime or not.
Return 1 if N is prime, else return 0.

Example :
  Input : 7
  Output : True
*/

//Checks if a number is a prime number
public int isPrime(int n)
{     
    if(n <= 1)
    {
        return 0;
    }
    for(int i = 2; i <= Math.sqrt(n); i++)
    {
        if(n % i == 0)
        {
            return 0;
        }
    }
    return 1;
}
