import java.util.*;
public class W9P5 {
    public static void main(String[] args)
    {
        int number = 100;
        try{
        number = Integer.parseInt("hi");
        System.out.println(number);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
    
}
