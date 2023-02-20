import java.lang.*;
import java.util.*;
public class leapYear {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year:");
        num = sc.nextInt();
        
    if(num%4==0)
    {
        if(num%100==0)
        {
            if(num%400==0)
            {
                 System.out.println("Leap Year");
            }
            else
            {
                 System.out.println("Not a Leap year:");
            }
        }
        
    }
    else
    {
         System.out.println("Not a leap Year");
        
    }
   
    }
    
}

