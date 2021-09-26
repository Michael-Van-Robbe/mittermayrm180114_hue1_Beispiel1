package net.htlgkr.mittermayrm180114.beispiel1;

public class Main
{
    public static void main(String[] args)
    {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(30);

        //test for "isPrime" method
        for(int i = 1; i <= 30; i++)
        {
            System.out.println("Number: " + i + ", " + eps.isPrime(i));
        }

        //test for "printPrimes" method
        eps.printPrimes();
    }
}