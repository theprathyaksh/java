import java.lang.*;
import java.util.*;

public class radix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Enter a number: ");
        num = sc.nextLine();
        
        if(num.matches("[01]*"))
        {
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]*"))
            {
                System.out.println("Octal Radix=8");
            }
        
        else if(num.matches("[0-9A-F]*"))
            {
                System.out.println("Hexa Radix=16");
            }
        else if(num.matches("[0-9]*"))
            {
                System.out.println("Decimal Radix=16");
                
            }
        else
        {
            System.out.println("Not a number");
        }
            
        
    }
    
}
