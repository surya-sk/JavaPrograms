import java.awt.*;
public class SlowPiece extends Piece
{

    //constructor
    public SlowPiece(String name, String color, Point position)
    {
        super(name, color, position);
    }

    //moves the piece one step to either the left or the right
    public void move(String direction)
    {  
        if(LEFT.equals(direction) && allowHorizontalMove(-1))
        {
            getPosition().move(getX(),getY()-1);
        }
        else if(RIGHT.equals(direction) && allowHorizontalMove(1))
        {
            getPosition().move(getX(),getY()+1);
        }
    }

    //return the type of the piece
    protected String getType()
    {
        return "S";
    }
}