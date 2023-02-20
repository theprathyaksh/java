class circle
{
    public double radius;
    
    public double areaOfCircle()
    {
        return Math.PI *radius *radius;
    }
    public double perimeterOfCircle()
    {
        return 2*Math.PI*radius;
    }
}
public class areaAndPerimeterOfCircle {
    public static void main(String[] args)
    {
        circle c = new circle();
        c.radius = 2.5;
        System.out.println("Area of Circle : "+c.areaOfCircle());
        System.out.println("Perimeter of Circle : "+c.perimeterOfCircle());
    }
    
}
