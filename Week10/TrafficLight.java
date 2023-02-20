

class lights extends Thread
{
    static String str;
    lights(String s)
    {
        str = s;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(str);
            try{Thread.sleep(10);}catch(InterruptedException e){}
        }
    }
}

public class TrafficLight
{
    public static void main(String[] args)
    {
        lights l1 = new lights("RED");
        lights l2 = new lights("YELLOW");
        lights l3 = new lights("GREEN");
        
        l1.start();
        l2.start();
        l3.start();
        
    }
}