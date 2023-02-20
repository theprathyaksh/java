
public class ThreadMethods extends Thread{
    public void run(){
        System.out.println("The currentThread = "+ this.currentThread());
        System.out.println("Is present thread daemon Thread: "+this.isDaemon());
        int n = 10;
        System.out.println("Squareroot of "+n+"="+Math.sqrt(n));
        System.out.println("The active count = "+this.activeCount());
    }
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new ThreadMethods());
        System.out.println("Is Thread t1 alive: "+t1.isAlive());
                t1.start();
        System.out.println("Is Thread t1 alive after start(): "+t1.isAlive());
        System.out.println("Group of t1: "+t1.getThreadGroup());
        System.out.println("Name of t1: "+t1.getName());
                    t1.setName("Second Thread");
        System.out.println("New name of t1: "+t1.getName());
    }
    
}
