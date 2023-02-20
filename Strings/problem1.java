
public class problem1 {
    public static void main(String[] args)
    {
        char c[] = {'A','B','C','D'};
        String str1 = new String(c);
        
        byte b[] = {65,66,67,60};
        String str2 = new String(b);
        
        System.out.println(str1.compareTo(str2));
    }
    
}
