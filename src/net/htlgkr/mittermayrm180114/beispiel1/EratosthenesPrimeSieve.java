package net.htlgkr.mittermayrm180114.beispiel1;

public class EratosthenesPrimeSieve implements PrimeSieve
{
    @Override
    public boolean isPrime(int p)
    {
        boolean isPrime = true;

        if(p <= 1)
        {
            isPrime = false;
        }

        for(int i = 2; i < p; i++)
        {
            if(p % i == 0)
            {
                isPrime = false;
            }
        }

        return isPrime;
    }

    @Override
    public void printPrimes()
    {

    }
}
