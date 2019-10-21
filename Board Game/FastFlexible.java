import java.awt.*;
public class FastFlexible extends FastPiece
{
    //constructor
    public FastFlexible(String name, String color, Point position)
    {
        super(name, color, position);
    }

    //moves the piece up, down, left or right by the given number of steps
    public void move(String direction,int n)
    {
        super.move(direction,n);  
        if(DOWN.equals(direction) && allowVerticalMove(n))
        {
            getPosition().move(getX()+n,getY());
        }
        else if(UP.equals(direction) && allowVerticalMove(-n))
        {
            getPosition().move(getX()-n,getY());
        }
    }

    //returns the type of the piece
    protected String getType()
    {
        return "FF";
    }
}