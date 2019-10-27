//calculates a given base to the given power
import java.util.Scanner;
public class Powers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:\n");
        int x = sc.nextInt();
        System.out.print("Enter the exponent:\n");
        int n = sc.nextInt();
        System.out.println(x+" to the power of "+n+" is "+power(x, n));
    }

    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return power(x,n-1)*x;
        }
    }
   
}