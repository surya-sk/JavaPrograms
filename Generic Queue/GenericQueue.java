//implementing a generic queue
import java.util.ArrayList;
public class GenericQueue<T>
{
    //instance variables
    private ArrayList<T> queue;
    static int count = 0;
    
    //contructor 
    public GenericQueue()
    {
        queue = new ArrayList<T>();
    }

    //returns the size of the queue
    public int size()
    {
        return queue.size();
    }

    //returns the first element of the queue
    public T peek()
    {
        if(queue.isEmpty())
        {
            return null;
        }
        return queue.get(count);
    }

    //removes the first element of the queue
    public T dequeue()
    {
        return queue.remove(0);
    }

    //adds given element to the queue
    public void enqeue(T element)
    {
        queue.add(element);
    }

    //returns true is the queue is empty
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    //clears the queue
    public void clear()
    {
        queue.clear();
    }

    //returns the position of the given item in the queue
    public int positionOf(T item)
    {
        return queue.indexOf(item);
    }

    //removes given item from the queue
    public void remove(T item)
    {
        queue.remove(item);
    }

    //returns the first element of the queue
    public T first()
    {
        return this.peek();
    }

    //returns the next element of the queue relative to the one before 
    public T next()
    {
        if(!isEmpty() && count==size()-1)
        {
            count = 0;
        }
        if(count<size())
        {
            count++;
            return queue.get(count);
        }

        return null;
    }
}