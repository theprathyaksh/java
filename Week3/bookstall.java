import java.util.*;
class Books
{
    public String bookName,bookAuthor;
    public int bookCount;
    Books(String bookName, String bookAuthor,int bookCount)
    {
        this.bookName = bookName;
        this.bookAuthor  = bookAuthor;
        this.bookCount = bookCount;
    }
    int DecBookCount()
    {
        bookCount--;
        return bookCount;
    }
   
}
class Customer
{
    String customerId,customerName,customerAddress;
    Customer(String customerId,String customerName,String customerAddress)
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }
    void buybook(Books b)
    {
        System.out.println("Remaining count of"+b.bookName+"is "+b.DecBookCount());
             
    }
    
    
    
    /*public String toString()
    {
        return "Text Book Name: "+bookName+"\n"+"Remaining Count of Text Books: "+bookCount;
    }*/
}
public class bookstall {
    public static void main(String[] args)
    {
        Books b[] = new Books[5];
        b[0] = new Books("wings of fire","Abdul kalam",8);
        b[1] = new Books("Power of subconsious Mind","john",2);
        b[2] = new Books("Think & rich grow","carl marx",10);
        b[3] = new Books("Rich dad poor dad","elon musk",4);
        b[4] = new Books("The monk","bruce lee",6);
        
        Customer c[] = new Customer[3];
        c[0] = new Customer("b182782","prahtyaksh","cherial");
        c[1] = new Customer("b182851","vishnu","new york");
        c[2] = new Customer("b182789","vivek","bombay");
        
        c[0].buybook(b[0]);
        c[1].buybook(b[3]);
   
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books you want to buy:");
        n = sc.nextInt();
        
        Books b[] = new Books[n];
        for(int i=0;i<n;i++)
        {
            b[i] = new Books();
            System.out.println("Enter name of Book");
            b[i].bookName = sc.next();
        }
        
        for(Books x:b)
            System.out.println(x);
        
         */   
    }
    
}
