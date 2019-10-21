import java.awt.*;
public class Piece
{

   //instance variables
    private String name;
    private String color;
    private Point position;

    public static String LEFT = "left";
    public static String RIGHT = "right";
    public static String UP = "up";
    public static String DOWN = "down";
    protected static int MIN = 0;
    protected static int MAX = 8;

    //constructor 
    public Piece(String name, String color, Point position)// contructor
    {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    //getters and setters
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public Point getPosition()
    {
        return position;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setPosition(Point position)
    {
        this.position = position;
    }

    //toString method
    public String toString()
    {
        return name+""+color+""+getType();
    }

    //returns xPos
    protected int getX()
    {
        return (int)this.position.getX();
    }

    //returns yPos
    protected int getY()
    {
        return (int)this.position.getY();
    }

    //checks if the piece isn't going off the board to the left or right
    protected boolean allowHorizontalMove(int n)
    {
        return (getY()+n>=MIN && getY()+n<MAX);
    }

    //checks if the peice isn't going above or below the board
    protected boolean allowVerticalMove(int n)
    {
        return (getX()+n>=MIN && getX()+n<MAX);
    }

    //returns true if two pieces are the same
    public boolean equals(Piece p)
    {
        return p.getName().equals(this.name) && p.getColor().equals(this.color) && p.getPosition().equals(this.position); 
    }

    //checks if the position of the piece is the same as the given position
    public boolean positionEquals(Point p)
    {
       return getPosition().equals(p);
    }

    //abstract move method of slow pieces
    public void move(String direction)
    {
        System.out.println("Unsupported method call.");
    }

    //abstract move method of fast pieces
    public void move(String direction, int n)
    {
        System.out.println("Unsupported method call.");
    }

    //returns the type of the piece so that it can be added to the toString method
    protected String getType()
    {
        return "P";
    }


}