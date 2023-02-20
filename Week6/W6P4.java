import java.util.*;
class ContractEmployee 
{
    private String Department;
    private  String Designation;
    private int salary;
    
    public void setDepartment(String Department)
    {
        this.Department = Department;
    }
    public void setDesignation(String Designation)
    {
        this.Designation = Designation;
    }
    public String getDesg(){
        return Designation;
    }
    public String getDept(){
        return Department;
    }
    
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary){this.salary = salary;}   
}
class HourlyEmployee extends ContractEmployee
{
    float NumberOfHours;
    float wagesPerHour;
    public void setdetails(float noofhours,float wages){
        NumberOfHours=noofhours;
        wagesPerHour=wages;
    }
    public float calculateWages()
    {
        return NumberOfHours*wagesPerHour*30;
    }
    public String getDesg(){
        return getDesg();
    }
    /*public void setDesignation(String Designation)
    {
        this.Designation = Designation;
    }*/
   
    
    
}
class WeeklyEmployee extends ContractEmployee
{
    float NumberOfWeeks;
    float wagesPerWeek;
    public void setdetails(float noofweeks,float wageperweek,int noofhours,float wage){
       NumberOfWeeks=noofweeks;
       wagesPerWeek=wageperweek;
       
    }
    public float calculateWages()
    {
        return NumberOfWeeks*wagesPerWeek;
    }
    public String getDesg()
    {
         return getDesg();
    }
}
public class W6P4 {
    public static void main(String[] args)
    {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employees: ");
        int n = sc.nextInt();
        
        HourlyEmployee []h = new HourlyEmployee[n];
        for(int i=0;i<n;i++)
        {
            h[i] = new HourlyEmployee();
            System.out.println("Enter Departement Name of Hourly Employee: ");
            h[i].setDepartment(sc.next());
            System.out.println("Enter Designation of Hourly Employee: ");
            h[i].setDesignation(sc.next());
            h[i].NumberOfHours = 8;
            h[i].wagesPerHour = 100;
            System.out.println("Salary of Hourly Employee: ");
            h[i].calculateWages();
            
        }*/
        
        HourlyEmployee h = new HourlyEmployee();
        h.NumberOfHours = 8;
        h.wagesPerHour = 100;
        System.out.println("Salary of Hourly Employee: "+h.calculateWages());
        
        WeeklyEmployee w = new WeeklyEmployee();
        w.NumberOfWeeks = 4;
        w.wagesPerWeek = 1000;
        System.out.println("Salary of Hourly Employee: "+w.calculateWages());
             
                     
    }
    
    
}
