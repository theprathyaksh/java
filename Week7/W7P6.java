import java.util.*;
interface studentFee
{
    public abstract float getAmount();
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getAddress();
    public abstract String getContact();
}
class hostler implements studentFee
{
    float getAmount;
    String getFirstName,getLastName,getAddress,getContact;
    hostler(float getAmount,String getFirstName,String getLastName,String getAddress,String getContact)
    {
        this.getAmount = getAmount;
        this.getFirstName = getFirstName;
        this.getLastName = getLastName;
        this.getAddress = getAddress;
        this.getContact = getContact;
    }
    public float getAmount()
    {
        return getAmount;
    }
    public String getFirstName()
    {
        return getFirstName;
    }
    public String getLastName()
    {
        return getLastName;
    }
    public String getAddress()
    {
        return getAddress;
    }
    public String getContact()
    {
        return getContact;
    }
     public String toString()
            {
                return "\nAmount: "+getAmount+"\nFirst Name: "+getFirstName+"\nLast name: "+getLastName+"\nAddress"+getAddress+"\nContact"+getContact;
                   
            }
    
    
}
class nonhostler implements studentFee
{
    float getAmount;
    String getFirstName,getLastName,getAddress,getContact;
    public float getAmount()
    {
        return getAmount;
    }
    public String getFirstName()
    {
        return getFirstName;
    }
    public String getLastName()
    {
        return getLastName;
    }
    public String getAddress()
    {
        return getAddress;
    }
    public String getContact()
    {
        return getContact;
    }
}
public class W7P6 {
    public static void main(String[] args)
    {
        /*hostler h = new hostler();
        h.getFirstName = "prathyaksh";
        h.getLastName = "Malligari";
        h.getAddress = "Cherial";
        h.getContact = "7993791231";
        h.getAmount = 40000;
        System.out.println("First name of Hostler Student: "+h.getFirstName);
        System.out.println("Last name of Hostler Student: "+h.getLastName);
        System.out.println("Amount paid: "+h.getAmount);*/
        hostler h[] = new hostler[2];
        h[0] = new hostler(50000,"prathyaksh","malligari","cherial","7993791231");
        h[1] = new hostler(2500,"virat","kohli","india","82409304823");
        
        for(hostler x:h)    
            System.out.println(x);
        
        
    }
    
}
