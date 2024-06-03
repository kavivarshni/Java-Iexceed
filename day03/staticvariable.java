class student{
     int x=10;                 //Static variable -> it shared amoung all classes not to a particular object
    int y=100;
    static int count=0;
    student()
    {
        count++;
        System.out.println(count);
    }
  

}

public class staticvariable {
    public static void main(String[] args) {
        student s=new student();
       new student();
    }
}

