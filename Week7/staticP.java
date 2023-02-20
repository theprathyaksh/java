class a
{
    void m1(int... a){
        System.out.println("parent");
    }
    
}

class b extends a{
    void m1(int a){
        System.out.println("child");
    }
}

public class staticP {   
    public static void main(String[] args) {
        a aa = new b();
        aa.m1(4);
    }
    
}
