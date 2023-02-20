
public class W9p4 {
    public static void main(String[] args)
    {
        int a = 12, b = 14, c;
        c = (a+b)*2;
        
        try{
            Class.forName("Demo");
        }
        catch(ClassNotFoundException e){System.out.println("Class file removed from CLASSPATH "+e);}
    }
    
}
