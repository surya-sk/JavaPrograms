import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StudentRecordDemo
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        GenericStack<StudentRecord> stack1 = new GenericStack<StudentRecord>();

        System.out.println("Enter the student details in the following format: [first name] [last name] [ID number]");
        System.out.println("Enter \"quit\" to exit");
        //inputting lines of text and dividing them into first name, last name and bannerID
        StringTokenizer tokenizer;
         String line = sc.nextLine();
        while(!line.equals("quit"))
        {
            tokenizer = new StringTokenizer(line, " ");
            String firstName = tokenizer.nextToken();
            String lastName = tokenizer.nextToken();
            String IDString = tokenizer.nextToken();
            Integer bannerID = Integer.valueOf(IDString);
            StudentRecord studentRecord = new StudentRecord(firstName, lastName, bannerID);
            stack1.push(studentRecord);
            line = sc.nextLine();
        }
 

        GenericStack<String> stack2 = new GenericStack<String>(); //creates a stack to hold last names.

        //pushes each student's last them and removes them until the stack is empty
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.peek().getLastName());
            stack1.pop();
        }

        //prints each item of the stack and removes it until the stack is empty.
        while(!stack2.isEmpty())
        {
            System.out.println(stack2.peek());
            stack2.pop();
        }
    }
}