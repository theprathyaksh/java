import java.util.*;

class ContractEmployee
{
    private String department;
    private String designation;
    private float salary;
    
    public String getDept(){return department;}
    public String getDesign(){return designation;}
    public Float getSalary(){return salary;}
    
    public void setDept(String dept)
    {
        department = dept;
    }
    public void setDesign(String design)
    {
        designation = design;
    }
    public void setSalary(Float sal)
    {
        salary = sal;
    }
}
class HourlyEmployee extends ContractEmployee
{
    int no_of_hrs;
    int wages_per_hr;
    
    public int calculatewages()
    {
        return no_of_hrs * wages_per_hr*30;
    }
}

class WeeklyEmployee extends ContractEmployee
{
    int no_of_weeks;
    int wages_per_week;
    
    public int calculatewages()
    {
        return no_of_weeks * wages_per_week;
    }
}
public class W6P3 {
    public static void main(String[] args)
    {
        HourlyEmployee he = new HourlyEmployee();
        he.no_of_hrs = 8;
        he.wages_per_hr = 100;
        System.out.println(he.calculatewages());
        
    }
    
}
