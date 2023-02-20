import java.util.*;
class productDetails
{
    String productId,productName;
    float productQuantity,productPrice;
    
   
}
public class Product {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        int option = sc.nextInt();
        System.out.println("Enter Quantity sold: ");
        int k = sc.nextInt();
        
        
        
        
        switch(option)
        {
            case 1: System.out.println("Total retail price: "+99.90*k);
                    break;
            case 2: System.out.println("Total retail price: "+20.20*k);
                    break;
            case 3: System.out.println("Total retail price: "+6.87*k);
                    break;
            case 4: System.out.println("Total retail price: "+45.50*k);
                    break;
            case 5: System.out.println("Total retail price: "+40.49*k);
                    break;
        }
        
    }
    
}
