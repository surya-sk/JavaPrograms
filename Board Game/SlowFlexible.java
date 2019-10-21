import java.awt.*;
public class SlowFlexible extends SlowPiece
{
    //contructor
    public SlowFlexible(String name, String color, Point position) 
    {
        super(name, color, position);
    }

    //moves the pieces one step to the left, right, up or down
    public void move(String direction)
    {
        super.move(direction);  
        if(DOWN.equals(direction) && allowVerticalMove(1))
        {
            getPosition().move(getX()+1,getY());
        }
        else if(UP.equals(direction) && allowVerticalMove(-1))
        {
            getPosition().move(getX()-1,getY());
        }
    }

    //returns the type of the piece
    protected String getType()
    {
        return "SF";
    }
 
}