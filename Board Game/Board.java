import java.util.ArrayList;
import java.awt.*;
public class Board
{
    //instance variable
    private ArrayList<Piece> board;

    //constructor
    public Board()
    {
        board = new ArrayList<Piece>(64);
    }

    //return true if a piece already exists in the position of piece wants to be added to
    private boolean isExists(Piece piece)
    {
        for(int i=0; i<board.size();i++)
        {
            if(board.get(i).positionEquals(piece.getPosition()))
            return true;
        }
        return false;
    }

    //returns the piece at the given position
    private Piece getPieceAtPosition(Point p)
    {
        for(int i=0; i<board.size();i++)
        {
            if(board.get(i).positionEquals(p))
            return board.get(i);
        }
        return null;
    }
    
    //adds given piece to the position if the position is empty
    public void Add(Piece piece)
    {
        if(isExists(piece))
        {
            System.out.println("Sorry, this position is occupied by another piece.");
        }
        else
        {
            board.add(piece);
        }
    }

    //moves fast and fast flexible pieces 
    public void Move(Point point, String direction, int n)
    {
    	Piece piece = getPieceAtPosition(point);
        if(piece!=null)
        {
        	piece.move(direction,n);
        	
        }
    }

    //moves slow and slow flexible pieces
    public void Move(Point point, String direction)
    {
 
        Piece piece = getPieceAtPosition(point);
        if(piece!=null)
        {
        	piece.move(direction);
        	
        }
    }

    //prints the board with all the pieces currently on it
    public void Display()
    {
        for(int i=0; i<8;i++)
        {
           for(int j =0; j<8;j++)
           {
             Piece p = getPieceAtPosition(new Point(i,j));
            if(p==null)
            {
                System.out.print("-\t\t\t");
            }
            else
            {
                System.out.print(p+"\t\t");
            }
           }
           System.out.println();
        }
    }
    
}