interface Fare
{
    public abstract float getAmount();
   
}
class bus implements Fare
{
    float fare;
    public float getAmount()
    {
        return fare;
    }
}
class train implements Fare
{
    float fare;
    public float getAmount()
    {
        return fare;
    }
}
public class W7P5 {
    public static void main(String[] args)
    {
        bus b = new bus();
        b.fare = 100;
        System.out.println("Fare paid by bus: "+b.getAmount());
    }
    
}
