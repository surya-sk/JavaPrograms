//finding the sum of squares of all the number up to the given number
import java.util.Scanner;
public class SumOfSquares
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(sumOfSquares(n));
    }
     
    public static int sumOfSquares(int n)
    {
        int sum = n*n;
        if(n==0)
        {
            return 0;
        }
        else
        {
            return sum+=sumOfSquares(n-1);
        }
    }
}