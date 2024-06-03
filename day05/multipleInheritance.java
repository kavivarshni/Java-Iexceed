interface college 
{
    public void college_details();
   
    default public void student_data()
    {
          System.out.println("student data");
    }
    
    
}
interface Hostel
{
    public void hostel_details();
   
    default public void student_data()
    {
        System.out.println("student data");
    }
}
class student implements college,Hostel
{
    public void college_details()
    {
          System.out.println("College details");
    }
     public void student_data()
    {
          System.out.println("Student data");
    }
    public void hostel_details()
    {
         System.out.println("Hostel details");
    }
   
}
public class multipleInheritance {
    public static void main(String[] args) {
        student s=new student();
        s.college_details();
        s.student_data();
        s.hostel_details();
    }
}
