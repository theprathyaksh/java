import java.util.*;


public class AddingTwoArrays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int A[][] = new int[6][6];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter n value: ");
        n = sc.nextInt();
        System.out.println("Enter elements: ");
        int B[][] = new int[3][3];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                B[i][j] = sc.nextInt();
            }
            
        }
        System.out.println(" ");
        int c[][] = new int[3][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] = A[i][j]+B[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
    
}
