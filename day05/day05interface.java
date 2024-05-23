interface stdata
{
    int rollno=27;
    int age=21;
    void display();
    void details();
}
class sample implements stdata
{
       int rollno=24;  //Cannot reassign value to interface variable as it public,static,final by default
       public void display()
       {
            System.out.println("Interface methods should be overriden");
       }
       public void details()
       {
        System.out.println("Interface methods must be overiden otherwise it shows error");
       }
}
public class day05interface {
    public static void main(String[] args) {
        sample s=new sample();
        s.display();
        s.details();
        
      student h=new student();
        h.college_details();
        h.hostel_details();
        h.student_data();
       
    }
}

//Multiple inheritance 
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