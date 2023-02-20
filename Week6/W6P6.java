import java.util.*;
class TwoWheeler 
{
   
   private String type;
   private String Name;
   
   public String gettype(){return type;}
   public String getName(){return Name;}
   
   public void settype(String type)
   {
       this.type = type;
   }
   public void setName(String Name)
   {
       this.Name = Name;
   }
}
class Geared extends TwoWheeler
{
    public void average()
    {
        
    }
}
class NonGeared extends TwoWheeler
{
   
    int nongeared,noOfVehicles;
    
    public float average()
    {
        return  nongeared/noOfVehicles;
    }
}
public class W6P6 {
    public static void main(String[] args)
    {
        
        
        NonGeared ng = new NonGeared();
        ng.nongeared = 20;
        ng.noOfVehicles = 10;
        System.out.println("avg of Non-Geared:"+ng.average());
    }
    
}
