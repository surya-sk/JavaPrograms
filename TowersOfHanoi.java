//calculating the number of steps taken to solve the Towers of Hanoi problem for n disks using recursion
import java.util.Scanner;
public class TowersOfHanoi
{
    public static long count;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks to move:");
        int n = sc.nextInt();
        System.out.println("Number of steps taken to solve: "+solve(n));
    }

    public static long solve(int n, int start, int end, int tmp)
    {
        if(n>0)
        {
            solve(n-1, start, tmp, end);
            count++;
            solve(n-1, tmp, end, start);
        }
        return count;
    }

    public static long solve(int n)
    {
        return solve(n, 1, 3, 2);
    }
}