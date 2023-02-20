class circle
{
    double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
}
class cylinder extends circle
{
    double height;
    public double area()
    {
        return 2*Math.PI*radius*height;
    }
}
public class AreaOfCirclePolymorphism {
    public static void main(String[] args)
    {
        cylinder c  = new cylinder();
        c.radius = 2.5;
        c.height = 5.0;
        System.out.println("Area of Cylinder "+c.area());
    }
    
}
