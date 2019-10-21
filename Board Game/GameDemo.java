import java.awt.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class GameDemo
{
    public static Board board = new Board();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = "";
        Piece piece;
        StringTokenizer tokenizer= new StringTokenizer(input," ");
        while(true)
        {
        	 System.out.println("Enter a command: (Type help for details)");
        	input = sc.nextLine(); //inputs command

            //game ends when exit is entered
            if(input.equals("exit"))
            {
                break;
            }

            //splitting the string into different variables
            tokenizer= new StringTokenizer(input," ");
            String token = tokenizer.nextToken();
            switch(token)
            {
                case("help"):help(); break;
                case("print"):board.Display(); break;
                case("create"):
                
                Point point = new Point(Integer.valueOf(tokenizer.nextToken()),Integer.valueOf(tokenizer.nextToken()));
                String option = tokenizer.nextToken();
                if(option.equals("fast"))
                {
                    //creates a fast or fast flexible pieces
                	if(tokenizer.hasMoreTokens())
                	{
                        if(!tokenizer.nextToken().equals("flexible"))
                        {
                            System.out.println("Invalid command.");
                        }
                        else
                        {
                            System.out.println("Input the name of your piece");
                            String name = sc.next();
                            System.out.println("Input the color for your piece");
                            String color = sc.next();
                            sc.nextLine();
                            piece = new FastFlexible(name, color, point);
                            board.Add(piece);
                        }
                	}
                	else
                	{
                		System.out.println("Input the name of your piece");
                        String name = sc.next();
                        System.out.println("Input the color for your piece");
                        String color = sc.next();
                        sc.nextLine();
                        piece = new FastPiece(name,color,point);
                        board.Add(piece);
                	}
                }
                //creates a slow or slow flexible pieces 
                else if(option.equals("slow"))
                {
                	if(tokenizer.hasMoreTokens())
                	{
                        if(!tokenizer.nextToken().equals("flexible"))
                        {
                            System.out.println("Invalid command.");
                        }
                        else
                        {
                            System.out.println("Input the name of your piece");
                            String name = sc.next();
                            System.out.println("Input the color for your piece");
                            String color = sc.next();
                            sc.nextLine();
                            piece = new SlowFlexible(name, color, point);
                            board.Add(piece);
                        }
                	}
                	else
                	{
                		System.out.println("Input the name of your piece");
                        String name = sc.next();
                        System.out.println("Input the color for your piece");
                        String color = sc.next();
                        sc.nextLine();
                        piece = new SlowPiece(name,color,point);
                        board.Add(piece);
                	}
                }
                break;
                case("move"):
                Point position = new Point(Integer.valueOf(tokenizer.nextToken()),Integer.valueOf(tokenizer.nextToken()));
                String direction = tokenizer.nextToken();
                if(tokenizer.hasMoreTokens())
                {
                    int steps = Integer.valueOf(tokenizer.nextToken());
                    board.Move(position, direction, steps);
                }
                else
                {
                    board.Move(position, direction);
                }
                break;
                default: System.out.println("Invalid command"); break;
            }
        }
    }

    private static void help()
    {
        System.out.println("Possible commands are as follows:\ncreate location [fast][flexible]: Creates a new piece. \nmove location direction [spaces]: Moves a piece. \nprint: Displays the board. \nhelp: Displays help.\nexit: Exits the program.");
    }
}