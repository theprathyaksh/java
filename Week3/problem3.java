import java.util.*;
public class problem3 {
    public static boolean check(int a[],int i,int c)
    {
        for(int k=0;k<i;k++)
        {
            if(a[k]==c)
            {
                return false;
            }
            
        }
        return true;
    }
    public static void print(int a[])
    {
        for(int i:a)
            System.out.print(i+" ");
    }
    
    
    public static void main(String[] args)
    {
       int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements between 10 to 100");
        System.out.println("Enter n number: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements: ");       
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            
            int c = a[i];
            if (check(a,i,c))
            {
                //continue;
            }
            else
                    i--;
                    
        }
        print(a);
    }
    
    
}
