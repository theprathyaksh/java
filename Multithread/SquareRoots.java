import java.lang.*;
class number extends Thread
{
    String ThreadName;
    Thread Th;
    number (String str)
    {
        ThreadName = str;
        Th = new Thread(this,ThreadName);
        System.out.println("Particulars of Thread"+Th);
        Th.start();
    }
    public void run()
    {
        int i;
        for(i=1;i<=4;i++)
            
            System.out.println(ThreadName+" "+Math.sqrt(i));
    }
}
public class SquareRoots {
    public static void main(String[] args)
    {
        new number("First Thread");
        new number("Second Thread");
        new number("Third Thread");
    }
    
}
