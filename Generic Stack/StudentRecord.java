//implementing a student record using the generic stack
public class StudentRecord
{
    //instance variables
    private String firstName;
    private String lastName;
    private int bannerID;

    //constructor
    public StudentRecord(String firstName, String lastName, int bannerID)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bannerID = bannerID;
    }

    //getter and setters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
     {
        return lastName;
     }
    public int getBannerID()
    {
        return bannerID;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setBannerID(int bannerID)
    {
        this.bannerID = bannerID;
    }

    //toString method
    public String toString()
    {
        return firstName+" "+lastName+" "+bannerID;
    }

}