import java.lang.*;
import java.util.*;

public class reverseOfaNumber{
    public static void main(String[] args)
    {
        int i,num,sum=0,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        
        num = sc.nextInt();
        
        for(i=0;i<=num;i++)
        {
            r = num%10;
            sum = sum *10+r;
           
        }
         System.out.println("Reverse of a number: "+sum);
        
    }
    
}
