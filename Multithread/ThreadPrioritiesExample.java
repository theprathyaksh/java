class PThread extends Thread{
    String ThreadName;
    Thread Th;
    int P;
    long flops = 0;
    
    PThread(String str, int n)
    {
        ThreadName = str;
        P = n;
        Th = new Thread(this,ThreadName);
        Th.setPriority(P);
        System.out.println("Particulars of new thread: "+Th);
        
        System.out.println("Particulars of new thread: "+Th.getPriority());
    }
    public void threadStart(){
        Th.start();
    }
    boolean threadRunning = true;
    
    public void run()
    {
        while(threadRunning)
        {
            double x = 1.1;
            double square = x*x;
            flops++;
        }
    }
    public void threadstop()
    {
        threadRunning = false;
    }
        
}
public class ThreadPrioritiesExample {
    public static void main(String[] args)
    {
     PThread PT1 = new PThread("First",Thread.MAX_PRIORITY); 
     PThread PT2 = new PThread("Second",Thread.NORM_PRIORITY); 
     PThread PT3 = new PThread("Third",1);
     PT1.threadStart();
     PT2.threadStart();
     PT3.threadStart();
     try{Thread.sleep(500);}
     catch(InterruptedException e){
         System.out.println("Main thread sleep interrupted");
         
     }
}  
}
    
    

