//Implementation of a generic stack
import java.util.ArrayList;
public class GenericStack<T>
{
    //instace variable
    private ArrayList<T> stack;

    //constructor
    public GenericStack()
    {
        stack = new ArrayList<T>();//initializing ArrayList
    }

    //returns the size of the ArrayList
    public int size()
    {
        return stack.size();
    }

    //returns the first element in the stack (last in the ArrayList)
    public T peek()
    {
        if(stack.isEmpty())
        {
            return null;
        }
        return stack.get(size()-1);
    }

    //removes the first element in the stack(Last in the ArrayList)
    public T pop()
    {
        return stack.remove(size()-1);
    }

    //adds given element to the stack
    public void push(T element)
    {
        stack.add(element);
    }

    //returns true if stack is empty
    public boolean isEmpty()
    {
        return stack.size()==0;
    }
}