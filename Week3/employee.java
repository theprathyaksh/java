import java.util.*;
class employeeDetails
{
     String EmpName, EmpAge, EmpGender, EmpDesignation,EmpAddress;
     int EmpSalary;
    public String toString()
     {
         return "\nName"+EmpName+"\nAge"+EmpAge+"\nGender"+EmpGender+"\nName"+EmpDesignation+"\nName"+EmpAddress+"\nSalary"+EmpSalary;
     }
}


public class employee {
    
     
    public static void main(String[] args)
    {   int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of employees: ");
        n = sc.nextInt();
       
        employeeDetails [] e = new employeeDetails[n];
        
        for(int i=0;i<n;i++)
        {
            e[i] = new employeeDetails();
            System.out.println("Enter Name:");
            e[i].EmpName = sc.next();
            
            System.out.println("Enter Age:");
            e[i].EmpAge = sc.next();
            
            System.out.println("Enter Gender:");
            e[i].EmpGender = sc.next();
            
            System.out.println("Enter Designation:");
            e[i].EmpDesignation = sc.next();
            
            System.out.println("Enter Address:");
            e[i].EmpAddress = sc.next();
            
            System.out.println("Enter salary:");
            e[i].EmpSalary = sc.nextInt();
            
        }
        for(employeeDetails x:e)
        {
            System.out.println(x);
        }

    }
    
}
