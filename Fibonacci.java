//Recursive program for computing the nth number in the fibonacci series
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        else
        {
           return fib(n-1) + fib(n-2);
        }
    }
}