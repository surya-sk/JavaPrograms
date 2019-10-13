//Program to claculate the nth prime number

import java.util.Scanner;
public class nthPrime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long p = sc.nextLong(); //inputs the position
        while(p!=0) //takes inputs until 0 is entered 
        {
            
            long result = nPrime(p);
            System.out.println(result);
            p = sc.nextLong();
        }
    }

    //finds the nth prime number
    public static long nPrime(long p)
    {
        int i = 2;
        long n = 0;
        while(i<p)
        {
            n+=6;
            if(isPrime(n+1))
            {
                i++;
            }
            if(isPrime(n-1))
            {
                i++;
            }
        }
        return n+1;
    }

    //testing whether given number is prime or not
    private static boolean isPrime(long n)
    {
        if(n<2) //since 2 is the smallest prime number
        {
            return false;
        }
        if (n % 2 == 0) 
        {
            return n == 2;
        }

        if (n % 3 == 0)
        {
            return n == 3;
        }

        var h = Math.floor(Math.sqrt(n));
        var i = 5;

    while (i <= h) 
    {
        if (n % i == 0)
        {
            return false;
        }
        if (n % (i + 2) == 0)
        {
            return false;
        }
        i+= 6;
    }
    return true;
        
    }
}

//algorithm inspired by https://www.xarg.org/puzzle/project-euler/problem-7/