import java.util.Scanner;
public class GenericStackTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Integer> stack2 = new GenericStack<Integer>();
        System.out.println("Enter strings. Enter \"quit\" to exit");
        String input = sc.next();
        //takes inputted strings and adds them to the stack as long as "quit" isn't entered
        while(!input.equals("quit"))
        {
            stack1.push(input);
            input = sc.next();
        }

        System.out.println("Enter integers. Enter \"-1\" to exit");
        int input1 = sc.nextInt();
        //takes inputted integers and adds them to the stack as long as "-1" isn't entered
        while(input1>-1)
        {
            stack2.push(input1);
            input1 = sc.nextInt();
        }

        //prints each item of the stack and removes it until the stack is empty.
        System.out.println("String stack contents:");
        while(!stack1.isEmpty())
        {
            System.out.println(stack1.peek());
            stack1.pop();
        }

        System.out.println();

        //prints each item of the stack and removes it until the stack is empty.
        System.out.println("Integer stack contents:");
        while(!stack2.isEmpty())
        {
            System.out.println(stack2.peek());
            stack2.pop();
        }
    }
}