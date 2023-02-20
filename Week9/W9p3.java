class Throwable extends Exception
{
    public String toString()
    {
        return "String Statement";
    }
}
public class W9p3 {
    static void meth1()throws Throwable
    {
        meth2();
    }
    static void meth2()throws Throwable
    {
        System.out.println("meth2 Exception");
    }
  
    public static void main(String[] args) throws Throwable
    {
       try
       {
           meth1();
       }
       catch(Throwable e)
       {
           System.out.println(e);
       }
       
    }
    
}
