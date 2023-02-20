abstract class Employee
{
    public abstract float getAmount();
    
}
class HourlyEmployee extends Employee
{
    float numberOfHours;
    float wagesPerHour;
    public float getAmount()
    {
        return numberOfHours*wagesPerHour*30;
    }
}
class WeeklyEmployee extends Employee
{
    float numberOfWeeks;
    float wagesPerWeek;
    public float getAmount()
    {
        return numberOfWeeks*wagesPerWeek;
    }
}
public class W7P2 {
    public static void main(String[] args)
    {
        HourlyEmployee he = new HourlyEmployee();
        he.numberOfHours = 8;
        he.wagesPerHour = 100;
        System.out.println("Amount to be Paid to the hourly Employee(Monthly):"+he.getAmount());
        
        WeeklyEmployee we = new WeeklyEmployee();
        we.numberOfWeeks = 4;
        we.wagesPerWeek = 1000;
        System.out.println("Amount to be Paid to the weekly Employee(Monthly):"+we.getAmount());
    }
    
}
