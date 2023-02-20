import java.lang.*;
import java.util.*;

public class areaOfTriangleUsingSides{
    public static void main(String[] args)
    {
        float a,b,c;
        float s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of Triangle:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        
        s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of Triangle is: "+area);
    }
    
}
