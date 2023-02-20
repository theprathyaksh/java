class number 
{

    void method1(){
        
        synchronized(this){
 
        for(int i=0;i<=25;i++)
        {
            System.out.println( i);
        }
        }
    }
    
        void method2(){
            synchronized(this){
 
        for(int i=26;i<=50;i++)
        {
            System.out.println( i);
        }
    }
  }
        void method3(){
            synchronized(this){
 
        for(int i=51;i<=75;i++)
        {
            System.out.println(i);
        }
    }
        }
        
    
   
}
public class EvaluateSquareRoots{
    public static void main(String[] args)
    {
      number n=new number();
       Thread t1=new Thread(){
           public void run(){
               n.method1();
           }
       } ;
        Thread t2=new Thread(){
           public void run(){
               n.method2();
           }
       } ;
         Thread t3=new Thread(){
           public void run(){
               n.method3();
           }
       } ;
         t1.start();
         t2.start();
         t3.start();
       
        
        
        
    }
}