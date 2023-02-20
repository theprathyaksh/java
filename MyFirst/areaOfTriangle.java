import java.lang.*;
import java.util.*;

public class areaOfTriangle {
    public static void main(String[] args)
    {
        float base,height,area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base and height of Triangle:");
        base = s.nextFloat();
        height = s.nextFloat();
        
        area = (base*height)/2;
        
        System.out.println("Area of Triangle is: "+area);
    }
    
}
