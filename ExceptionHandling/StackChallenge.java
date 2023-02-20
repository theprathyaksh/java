class stackOverflow extends Exception
{
    public String toString()
    {
        return "Stack is full";
    }
   
}
class stackUnderflow extends Exception
{
    public String toString()
    {
        return "stack is empty";
    }
}

class stack{
    private int size;
    private int top=-1;
    private int s[];
    
    public  stack(int sz)
    {
        size = sz;
        s = new int[sz];
    }
    public void push(int x) throws stackOverflow
    {
        if(top==size-1)
        {
            throw new stackOverflow();
           
        }
         top++;
         s[top] = x;
    }
    public int pop() throws stackUnderflow
    {
        int x=-1;
        if(x==-1)
            throw new stackUnderflow();
    x =s[top];
    top--;
    return x;           
    } 
}
public class StackChallenge
{
    public static void main(String[] args)
    {
        stack st=new stack(5);
        
        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        
        }
        catch(stackOverflow s)
        {
            System.out.println(s);
        }
    }
}