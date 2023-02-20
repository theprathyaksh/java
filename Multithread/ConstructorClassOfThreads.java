
public class ConstructorClassOfThreads extends Thread{
    public void run(){
        System.out.println("It is Thread class");
    }
    public static void main(String[] args){
       Thread th = new Thread(new ConstructorClassOfThreads(),"first thread");
       Thread t1 = new Thread(new ConstructorClassOfThreads());
        System.out.println("Name of th = "+th.getName());
        System.out.println("Name of t1 = "+t1.getName());
        th.start();
        t1.start();
       
       /*ConstructorClassOfThreads t = new ConstructorClassOfThreads();
       System.out.println("Name of t = "+t.getName());
       t.start();*/
       
       

    }
    
    
}
