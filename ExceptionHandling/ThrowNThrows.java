class negativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions can't be negative. Please Enter Positive values";
    }
}
public class ThrowNThrows {
   static int area(int l, int b) throws negativeDimensionException
   {
       if(l<0 || b<0)
           throw new negativeDimensionException();
       return l*b;
   }
   static void meth1() 
   {
       try{
       System.out.println("Area is"+area(-10,5));
       }
       catch(negativeDimensionException e)
       {
           System.out.println(e);
       }
   }
    public static void main(String[] args)
    {
       
        meth1();
        
       
    }
    
}
