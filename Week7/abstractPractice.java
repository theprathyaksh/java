interface honor
{
//    public void call()
//    {
//        System.out.println("Callingssssssssssss");
//    }
    public abstract void selfi();
    public abstract void touch();
    public abstract void games();
    
}
abstract class honor7a implements honor
{
    public void selfi()
    {
        System.out.println("Take a Selfi");
    }
    public void touch(){}
    //public void games(){}
}

class honor5 extends honor7a{
    public void games(){}
}

class honor8a extends honor7a
{
    public void touch()
    {
        System.out.println("pls touch to navigate");
    }
    public void games()
    {
        System.out.println("Game mode is On");
    }
}

public class abstractPractice {
    public static void main(String[] args)
    {
        honor h = new honor8a();
       
        h.games();
        h.touch();
        
    }
    
}
