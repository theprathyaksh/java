
public class MethodPractice {
    int max(int a, int b)
    {
        return a>b?a:b;
    }
    public int max(int a, int b, int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
            
    }
    public float max(float x, float y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args)
    {
        MethodPractice  m = new MethodPractice();
        System.out.println(m.max(10.9f, 20.7f));
        System.out.println(m.max(10, 20));
        System.out.println(m.max(30,20, 10));
    }
    
}
