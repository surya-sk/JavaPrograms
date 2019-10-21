import java.util.Scanner;
public class PrintQueueDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PrintQueue pq = new PrintQueue();
        //View PrintQueue class to view description of each method to know what to input 
        pq.lpr(sc.next(),sc.nextInt());
        pq.lpr(sc.next(),sc.nextInt());
        pq.lpr(sc.next(),sc.nextInt());
        pq.lpr(sc.next(),sc.nextInt());
        pq.lpr(sc.next(),sc.nextInt());

        System.out.println();
        pq.lpq();
        System.out.println();
        pq.lprm(sc.nextInt());
        System.out.println();
        pq.lpq();
    }
}