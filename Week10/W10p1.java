class MyThread extends Thread
{
    public void run()
    {
            System.out.println("HELLO WORLD");
        
    }
}
public class W10p1 {
    public static void main(String[] args)
    {
        MyThread m = new MyThread();
        MyThread m1 = new MyThread();
        m1.start();
        m.start();
    }
    
}
