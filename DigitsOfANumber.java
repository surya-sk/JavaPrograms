//prints each digit of the given number on separate lines
import java.util.Scanner;
public class DigitsOfANumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printDigits(n);

    }

    public static void printDigits(int n)
    {
        int i = n%10;
       if(n==0)
        {
            return;
        }
        else
        {
            printDigits(n/10);
            System.out.println(i);   
        }
        
    }
}