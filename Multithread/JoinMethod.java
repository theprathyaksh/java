class joinThreadDemo extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=4;i++)
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
    }
}
public class JoinMethod {
    public static void main(String[] args)
    {
        joinThreadDemo th1 = new joinThreadDemo();
        joinThreadDemo th2 = new joinThreadDemo();
        
        try{
        th1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        th2.start();
    }
    
}
