
class MyThread3 implements Runnable {
    String ThreadName;
    Thread Th;
    
    MyThread3  (String str)
    {
        ThreadName = str;
        Th = new Thread(this,ThreadName);
        System.out.println("Particulars of new Thread"+Th);
        Th.start();
    }
    public void run()
    {
        try{
            for(int k=1;k<=4;k++)
                System.out.println(ThreadName +":k ="+k);
            Thread.sleep(250);
        }
        catch(InterruptedException e)
        {
            System.out.println(ThreadName+"has been Inerrupted");
        }
        System.out.println(ThreadName+"exits.");
        
    }
    
}
public class MultipleThreadsByRunnable{
    public static void main(String[] args)
    {
        new MyThread3 ("First Thread");
        new MyThread3 ("Second Thread");
        new MyThread3 ("Third Thread");
        
        try{
            for(int j=1;j<5;j++)
                System.out.println("Main Thread j = "+j);
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Mian Thread interrupted");
        }
        System.out.println("Main Thread Exits");
        
    }
}
