import java.util.*;
abstract class hub
{
    String Name,ID,Address,grade,Password;
    long phoneNo;
    int m1,m2,m3,m4;
    float marks,Fee,total,average;
    
    public abstract void StudentDetails();
    public abstract void subjectMarks();
    public abstract void grade();
    public abstract void  Fee();
}
abstract class AcademicSection extends hub
{
    
    
    
    public void StudentDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        ID = sc.next();
        System.out.println("Enter Your Password: ");
        Password = sc.next();
        String temppass = sc.next();
        if(temppass.equals(Password))
            System.out.println(StudentDetails);
        else
            System.out.println("please enter correct Password");
        
        System.out.println("Enter Student Name: ");
        Name=sc.next();
        System.out.println("Enter Student ID: ");
        ID = sc.next();
        System.out.println("Enter Address: ");
        Address = sc.next();
        System.out.println("Enter Phone Number");
        phoneNo = sc.nextLong();
    }
}
abstract class examinationSection extends AcademicSection
{
    public void subjectMarks()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject one Marks: ");
        m1 = sc.nextInt();
        System.out.println("Enter subject two Marks: ");
        m2 = sc.nextInt();
        System.out.println("Enter subject two Marks: ");
        m3 = sc.nextInt();
        System.out.println("Enter subject two Marks: ");
        m4 = sc.nextInt();
        total = (m1+m2+m3+m4);
        super.average = total/4.0f;
        System.out.println(average);
    }
    public void grade()
    {
        System.out.println(average);
        if(average>90.0){
                grade = "Excellent";
                System.out.println("Excellent");
        }
        else if(average>80.0 && average <90.0){
            grade = "A";
                System.out.println("A");
        }
        else if(average>50.0 && average <60.0){
            grade = "B";
                System.out.println("B");
        }
        else if(average>40.0 && average <30.0){
            grade = "C";
                System.out.println("c");
        }
        else{
            grade = "Fail";
            System.out.println("Fail");
        }
    }
}
class ScholarshipSection extends examinationSection
{
    public void Fee()
    {
        Scanner sc = new Scanner(System.in);
        if(grade.equals("Excellent")){
            Fee = 20000;
        }
    }
}

class StudentSystem{
    public static void main(String[] args){
        hub s = new ScholarshipSection();
        s.StudentDetails();
        s.subjectMarks();
        s.grade();
        s.Fee();
        
    }
}