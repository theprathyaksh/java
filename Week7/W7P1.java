import java.util.*;
abstract class shape
{
    double area,Volume;
    double radius;
    
    public abstract double getArea();
    public  abstract  double getVolume();    
}
abstract class circle extends shape
{
    
    public double getArea()
    { 
        
        return Math.PI*radius*radius;
    }
    public abstract double getVolume();
   
}
class cylinder extends shape
{
    double height;
    public double getArea()
    {
        
        return 2*Math.PI*radius*height+(2*Math.PI*radius*radius);
    }
    public double getVolume()
    {
        return Math.PI*radius*radius*height;
    }
    
}
class sphere extends shape
{
    double height;
    public double getArea()
    {
        return 4*Math.PI*radius*radius*height;
    }
    public double getVolume()
    {
        return 4/3*Math.PI*radius*radius;
    }
}
class square extends shape
{
    
    public double getArea()
    {
        this.radius = radius;
        return radius*radius;
    }
    public double getVolume()
    {
        return radius*radius*radius;
    }
}
class cube extends shape
{
    
    public double getArea()
    {
        return 6*radius*radius;
    }
    public double getVolume()
    {
        return radius*radius*radius;
    }
}
public class W7P1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        shape s = new cylinder();
        s.radius = 2.5;
        System.out.println("Area of Circle: "+s.getArea());
        
        
       /* while(true)
        {
            System.out.println("Enter Option to Calculate Area of Shapes: ");
            System.out.println("1. Circle");
            System.out.println("2. Cylinder");
            System.out.println("3. Sphere");
            System.out.println("4. Square");
            System.out.println("5. Cube");
            
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:{
                    System.out.println("Enter Radius of Circle: ");
                    double radius = sc.nextDouble();
                    shape s = new cylinder();
                    System.out.println("Area of Circle is: "+s.getArea(radius));
                }
                break;
                case 2:{
                    System.out.println("Enter radius of Cylinder: ");
                    double radius = sc.nextDouble();
                    System.out.println("Enter height of Cylinder: ");
                    double height = sc.nextDouble();
                    cylinder c = new cylinder();
                    System.out.println("Area of Cylinder is: "+c.getArea(radius));
                    System.out.println("Volume of Cylinder is: "+c.getVolume(radius));
                }
                break;
                default:System.out.println("Enter valid Option");
                    
            }
        */
        
        
        
        
    }
    
}
