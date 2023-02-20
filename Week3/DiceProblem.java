import java.util.*;
import java.util.Random;

public class DiceProblem {
    public static void main(String[] args)
    {
        int n = 10,c=0;
        for(int i=0;i<n;i++)
        {
            Random r1 = new Random();
            int d1=r1.nextInt(1,7);
   
            int d2=r1.nextInt(1,7);
            
            if(d1==d2)
                c++;
        }
        System.out.println("Successful Attempts "+c);
        
    }
    
}
