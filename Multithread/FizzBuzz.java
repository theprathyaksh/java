public class FizzBuzz extends Thread {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        System.out.println("fizz");
        
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        System.out.println("buzz");
        
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        System.out.println("fizzbuzz");
        
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        int i,n;
        for(i=0;i<n;i++)
            System.out.println(i);


    public void run()
    {
        fizz();
        buzz();
        fizzbuzz();
        number();
    }
        
    public static void main(String[] args)
    {
        FizzBuzz fb = new FizzBuzz();
        FizzBuzz fb1 = new FizzBuzz();
        FizzBuzz fb2 = new FizzBuzz();
        FizzBuzz fb3 = new FizzBuzz();
        fb.start();
        fb1.start();
        fb2.start();
        fb3.start();
        

        
    }
    }
}