import java.util.Scanner;
public class Factorial
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you the factorial of: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
}