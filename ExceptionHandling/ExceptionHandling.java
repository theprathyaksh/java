
public class ExceptionHandling {

    
    public static void main(String[] args) {
        int a = 10,b=0,c;
        
        try
        {
        c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should be 0,try again"+e);
        }
        System.out.println("Bye");
    }
    
}
