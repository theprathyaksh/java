
class temperature extends Thread
{
    @Override
    public void run()
    {
        float celcius,fahrenheit;
        celcius = 36;
        fahrenheit = ((celcius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
    }
}
public class CelciustoFahrenheit {
    public static void main(String[] args)
    {
        temperature t = new temperature();
        t.start();
        
    }
    
}
