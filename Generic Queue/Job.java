//implementing a jobs class to work with generic queue
public class Job
{

    //instance variables
    private String owner;
    private int jobID;

    //constructor
    public Job(String owner, int jobID)
    {
        this.owner = owner;
        this.jobID = jobID;
    }

    //getter and setters
    public String getOwner()
    {
        return owner;
    }
    public int getJobID()
    {
        return jobID;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public void setJobID(int jobID)
    {
        this.jobID = jobID;
    }

    //toString method
    public String toString()
    {
        return owner+" "+jobID;
    }


}