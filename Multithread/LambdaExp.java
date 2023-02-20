
public class LambdaExp {
    public static void main(String[] args){
        new Thread(LambdaExp::Method1).start(); //Method Reference
        
        new Thread(() -> Method2 ()).start(); //Lambda Expression
        
        new Thread(new Runnable() //Conventional Expression
        {
            public void run()
            {
                Method3();
            }
        }).start();
    }
    static void Method1()
    {
        System.out.println("It is Method reference thread");
    }
    
     static void Method2()
    {
        System.out.println("It is Lamda expression method thread");
    }
      static void Method3()
    {
        System.out.println("It is conventional method thread");
    }
    
}
