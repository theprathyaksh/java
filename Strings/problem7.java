
public class problem7 {
    public static void main(String[] args)
    {
        String str = "hello", nstr ="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reverse word:"+nstr);
    }
    
}
