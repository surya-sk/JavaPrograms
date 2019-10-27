//prints n number of mutiples of a given number x
import java.util.Scanner;
public class Multiples
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiples you want to display:");
        int x = sc.nextInt();
        System.out.println("Enter the number of multiples to be displayed:");
        int n  = sc.nextInt();
        multiples(x,n);
    }
    public static void multiples(int x, int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            multiples(x, n-1);
            System.out.print(x*n+" ");
        }
    }
}