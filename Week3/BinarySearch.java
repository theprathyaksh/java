import java.util.*;
class BinarySearch
{
    int n,i,j;
    int a[];  
    void read()
    {
        System.out.println("Enter N value:");        
        Scanner sc=new Scanner(System.in);        
        n=sc.nextInt();        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    void search()
    {
        System.out.println("Searched");
    }
}
class Main
{
    
    public static void main(String[] Args)
    {
        
        BinarySearch bs=new BinarySearch();
        bs.read(); 
        bs.sort(); 
        bs.search();
    }       
}