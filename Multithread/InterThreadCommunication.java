class BankAccount{
    
       int AccountNumber;
       static double Balance;
    
    BankAccount(int AccountNumber, double Balance) //constructor method
    {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    
    
    static int amount = 1000; 
    synchronized void withDraw(int amount)
        {
            
            if(this.amount<amount){System.out.println("Less Balance available; waiting ti deposit more");}
            try{
                wait();
            }
            catch(Exception e){}
            
        }
     synchronized double deposit(int amount)
        {
            System.out.println("Going to Deposit");
            Balance = Balance + amount;
            System.out.println("Balance after deposit = "+Balance);
            notify();
                return(Balance);
        }
}
public class InterThreadCommunication{
    public static void main(String[] args){
        final BankAccount ba = new BankAccount(12334,1000.0);
        new Thread(){
            public void run(){
                ba.withDraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                ba.deposit(10000);
            }
        }.start();
    }
}
    
    

