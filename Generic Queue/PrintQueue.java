//uses Job class to add Jobs to the queue
//class uses methods from unix command-line
public class PrintQueue
{
    //instance variable
    private GenericQueue<Job> jobs;

    //constructor
    public PrintQueue()
    {
        jobs = new GenericQueue<Job>();
    }

    //adds the owner and jobID to a job object and adds the job to the queue
    public void lpr(String owner, int jobID)
    {
        Job thisJob = new Job(owner, jobID);
        jobs.enqeue(thisJob);
    }
    //prints all the jobs in the queue
    public void lpq()
    {
        System.out.println(jobs.first());
        for(int i = 1; i<jobs.size();i++)
        {
            System.out.println(jobs.next());
        }
    }

    //removes the job with the given jobID if the job is currently active
    public void lprm(int jobID)
    {
        if(jobs.peek().getJobID()==jobID)
        {
            jobs.dequeue();
        }
        else
        {
            System.out.println("Sorry, this job is not currently active.");
        }
    }

    //removes all the jobs submitted by given ownner
    public void lprmAll(String owner)
    {
        GenericQueue<Job> result = jobs;
        int i =0;
        while(i<result.size())
        {
            if(!result.peek().getOwner().equals(owner))
            {
                result.dequeue();
            }
            i++;
        }
        jobs = result;
    }
}