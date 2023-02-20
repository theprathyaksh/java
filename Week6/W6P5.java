class vehicle
{
     String vehicleNumber, InsuranceNumber,color;
     private String Consumption;
     public String getConsumption()
     {
         return Consumption;
     }
     public void setConsumption(String Consumption)
     {
         this.Consumption = Consumption;
     }
     public void displayConsumption()
     {
         System.out.println("You have consumed 2 liter Petrol");
     }   
}
class TwoWheeler extends vehicle
{
    float servicingCost,petrolCost;
    public float maintenance()
    {
        System.out.println("Maintainence of two wheeler is :"+servicingCost+petrolCost);
        return 0;
    }
    public void average()
    {
        System.out.println("Average Cost of Maintainence of Two Wheeler is: "+ (servicingCost+petrolCost)/2);
    }
}
class FourWheeler extends TwoWheeler
{
    float deseilPrice,goodsCost;
    public float maintenance()
    {
       System.out.println("Maintainence of four wheeler is :"+deseilPrice+goodsCost+servicingCost);
       return 0; 
    }
}

public class W6P5 {
    public static void main(String[] args)
    {
        TwoWheeler tw = new TwoWheeler();
        tw.petrolCost = 90;
        tw.servicingCost = 1000;
        tw.maintenance();
        tw.average();
    }
    
}
