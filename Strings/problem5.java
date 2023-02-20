class vowelConsonants
{
    public static void count(String str)
    {
        int vow = 0, con = 0;
        
        String ref = "aeiouAEIOU";
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i) >= 'A') && str.charAt(i) <= 'Z' || (str.charAt(i)>='a'&& str.charAt(i)<='z'))
                    {
                       if(ref.indexOf(str.charAt(i)) != -1)
                           vow++;
                       else
                           con++;
                    }
        }
        System.out.println("Number of vowels = "+vow+"\nNumber of consonants"+con);
        
        
    }
}

public class problem5 {
    public static void main(String[] args)
    {
        String str = "iamprathyaksh";
        vowelConsonants.count(str);
        
    }
    
}

