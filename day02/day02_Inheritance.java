//To Invoke Parent Class Constructor
class cat 
{
    cat()
    {
        System.out.println("Inside cat class");
    }
}
class dog extends cat
{
    dog()
    {
        super();                                        //Accessing Constructor
        System.out.println("Inside Dog Class");
    }
}
//To invoke Parent class Method
class jerry
{
    int age=10;
    public void display()
    {
    System.out.println("Jerry Age = "+age);
    }
}
class tom extends jerry
{
    tom()
    {
     super.display();                                      //Accessing Method
    }
}
//To invoke Parent class Variable
class teacher
{
    String name;
    int attendance;
    teacher(String name,int attendance)
    {
        System.out.println(name + attendance);
    }
}
class student extends teacher
{
    int quantity;
    student(String name,int attendance,int quantity)
    {
       super(name,attendance);                          //Accessing Variable
       System.out.println(name+attendance+quantity);
    }
}
public class day02_Inheritance {
    public static void main(String[] args) {
        new dog();
        new tom();
        new student("Kavi",110,1);
    }
}
