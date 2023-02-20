class diviException extends Exception
{
    public String toString()
    {
        return "pls dont enter 0";
    }
}
public class Week9
{
   public static int divide(int a, int b)throws diviException
   {
       if(a<0)
           throw new diviException();
       int result =  a/b;
       return result;
   }
   public static void main(String[] args)
   {
       try
       {
       int c = divide(- 6,0);
       System.out.println(c);
       }
       catch(diviException e)
       {
           System.out.println(e);
       }
       finally
       {
           System.out.println("I am there");
       }
   }
}