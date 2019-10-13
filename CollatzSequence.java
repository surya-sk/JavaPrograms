/*
    The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined as follows: 
    start with any positive integer n. Then each term is obtained from the previous term as follows:
    if the previous term is even, the next term is one half the previous term.
    If the previous term is odd, the next term is 3 times the previous term plus 1. 
    The conjecture is that no matter what value of n, the sequence will always reach 1.
    (Source:https://en.wikipedia.org/wiki/Collatz_conjecture)
*/
import java.util.Scanner;
public class CollatzSequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //inputs the number 
        while(n!=0)//takes inputs until 0 is entered
        {
            System.out.println("Longest Sequence: "+longestSequence(n)+"\tLenght of the Sequence: "+sequenceCount(longestSequence(n))); 
            n = sc.nextInt();       
        }
        
    }

    //method to measure the number less than or equal to given number
    //with the longest sequence 
    public static int longestSequence(int n)
    {
        int count = 0;
        int largest = count;
        int numWithLongestSeq = 0;
        for(int i = n;i>0;i--)
        {
            count = sequenceCount(i);
            if(count>largest)
            {
                largest = count;
                numWithLongestSeq = i;
            }
        }
        return numWithLongestSeq; //returns the number with the longest sequence 
    }

    //method to count how long the sequence is 
    public static int sequenceCount(int p)
    {
        int count = 1;
        while(p!=1)
        {
        	count++;
            if(p%2==0)
            {
                p = p/2;
            }
            else
            {
                p = (p*3)+1;
            }
            
        }
        return count;
    }
}