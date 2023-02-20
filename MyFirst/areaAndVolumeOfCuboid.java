import java.lang.*;
import java.util.*;

public class areaAndVolumeOfCuboid {
    public static void main(String[] args)
    {
        int length,breadth,height;
        int totalArea,volume;
        
        Scanner s = new Scanner(System.in);
        length = s.nextInt();
        breadth = s.nextInt();
        height = s.nextInt();
        
        totalArea = 2*(length*breadth + length*height + breadth*height);
        volume = length*breadth*height;
        
        System.out.println("Total Area of Cuboid is: "+totalArea);
        System.out.println("Total Volume of Cuboid is: "+volume);
          
    }
    
}
