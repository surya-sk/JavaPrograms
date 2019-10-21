import java.awt.*;
public class FastPiece extends Piece
{
    //constructor
    public FastPiece(String name, String color, Point position) 
    {
        super(name, color, position);
    }

    //moves the piece to either the left or right by the given number of steps
    public void move(String direction, int n)
    {
        if(LEFT.equals(direction) && allowHorizontalMove(-n))
        {
            getPosition().move(getX(),getY()-n);
        }
        else if(RIGHT.equals(direction) && allowHorizontalMove(n))
        {
            getPosition().move(getX(),getY()+n);
        }
    }   

    //returns the type of the piece
    protected String getType()
    {
        return "F";
    }
}   