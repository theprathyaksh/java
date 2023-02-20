
public class stringMethods {
    public static void main(String[] args)
    {
        String str = new String("Prathyaksh  ");
        
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(5));
        System.out.println(str.replace("a", "e"));
        System.out.println(str.startsWith("P"));
        System.out.println(str.endsWith("h"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("h"));
        System.out.println(str.equals("Prethyeksh"));
        System.out.println(str.equalsIgnoreCase("prath"));
    }
}
