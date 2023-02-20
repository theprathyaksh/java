import java.util.*;
class MyData
{
    int value;
    
    public void set(int v)
    {
        
        value=v;
        
    }
    
    public int get()
    {
        int x=0;

        x=value;

        return x;            
    }
}
class Train extends Thread
{
    MyData data;
    
    int avialableBerths=100;
    
    Scanner sc = new Scanner(System.in);
  
    Train(MyData d)
    {
        
        data = d;
    }
    public void run(){
        System.out.println("Available Berths: "+avialableBerths);
        while(true){
            data.set(avialableBerths);
            
            System.out.println("Enter Requested Births: ");
            int requestedBerths = sc.nextInt();
   
        if(requestedBerths<=avialableBerths)
        {
            avialableBerths = avialableBerths - requestedBerths;
            System.out.println("Ticket Issued");
            System.out.println("Available Berths: "+avialableBerths);
        }
        else
        {
            System.out.println("Births are not Avaialable");
            break;
        }
        
        }
    }
}

public class TrainReservationSystem {
    public static void main(String[] args)
    {
        MyData data = new MyData();
        Train t = new Train(data);
       
        
        t.start();
        
        
    }
    
}
