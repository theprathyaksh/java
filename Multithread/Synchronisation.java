
public class Synchronisation {
    int AccountNumber;
    static double Balance;
    Synchronisation(int AccountNumber, double Balance) //constructor method
    {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    public static void main(String[] args)
    {
        Synchronisation s = new Synchronisation(1234,1000);
        System.out.println("initial Balance = "+Balance);
        new Thread(()-> deposit()).start(); //lambda expression
        
        new Thread(new Runnable() // Anonymous inner Class or Conventional Method
        {
           public void run(){withDraw();}
        }).start();
        }
    
        public static synchronized boolean deposit() 
        {
            double amount = 500.0;
            if(amount<0.0){return false;}
            else
            {
                Balance = Balance + amount;
                System.out.println("Balance after deposit = "+Balance);
                return true;
            }
        }
         public static synchronized boolean withDraw()
        {
            double withdrawalAmount = 400.0;
            if(withdrawalAmount<0.0){return false;}
            else
            {
                Balance = Balance - withdrawalAmount;
                System.out.println("Balance after Withdrawal = "+Balance);
                return true;
            }
        }
    }
    
    

