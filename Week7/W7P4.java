interface vehicle
{
    
    public abstract String getColor();
    public abstract String getNumber();
    public abstract float getConsumption();
    
}
class TwoWheeler implements vehicle
{
    String Color,getNumber;
    float fuel;
    public String getColor()
    {
       return Color;   
    }
    public String getNumber()
    {
        return getNumber;
    }
    public float getConsumption()
    {
        return fuel;
    }
}
class FourWheeler implements vehicle
{
    String Color,getNumber;
    float fuel;
    public String getColor()
    {
       return Color;   
    }
    public String getNumber()
    {
        return getNumber;
    }
    public float getConsumption()
    {
        return fuel;
    }
}
public class W7P4 {
    public static void main(String[] args)
    {
        TwoWheeler tw = new TwoWheeler();
        tw.Color = "blue";
        tw.getNumber = "Ap36J2049";
        tw.fuel = 10;
        System.out.println("Color of Two Wheeler : "+tw.getColor());
        System.out.println("Vehicle Number : "+tw.getNumber());
        System.out.println("Fuel Consumed : "+tw.getConsumption());
        
        FourWheeler fw = new FourWheeler();
        fw.Color = "Red";
        fw.getNumber = "Ts08k3722";
        fw.fuel = 15;
        System.out.println("Color of Four Wheeler : "+fw.getColor());
        System.out.println("Vehicle Number : "+fw.getNumber());
        System.out.println("Fuel Consumed : "+fw.getConsumption());
    }
    
}
