interface payable
{
    public abstract float getAmount();
}
class Employee implements payable
{
    float invoice,amount;
    public float getAmount()
    {
        return invoice+amount;
    }
    
}
public class W7P3 {
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.invoice = 100;
        e.amount = 5000;
        System.out.println("Amount to be Paid:"+e.getAmount());
        
    }
    
}
