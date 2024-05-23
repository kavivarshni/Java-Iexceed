
abstract class Student
{
    abstract public void display();
}
public class day10_anonymous {
    public static void main(String[] args) {
        Student s=new Student() {
           public void display()
           {
               System.out.println("Welcome to Anonymous Function");
           }
    };s.display();
}
}
