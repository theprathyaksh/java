
class MyData
{
    int value;
    boolean flag=true;
    
    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}
        
        value=v;
        flag=false;
        notify();
    }
    
    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}
        
        
        x=value;
        flag=true;
        notify();
        
        return x;            
    }
}

class IssueTicket extends Thread
{
    MyData data;
    
    public IssueTicket(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Ticket Issued "+count);
            count++;
            try{
            IssueTicket.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}

class ShowTicket extends Thread
{
    MyData data;
    
    public ShowTicket(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Ticket shown "+value);
        }
    }
}

public class W10P4
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        IssueTicket p=new IssueTicket(data);
        ShowTicket c=new ShowTicket(data);
        
        p.start();
        c.start();
        
    }
}