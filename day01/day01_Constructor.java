class student
{
    student()                                               //Constructor
    {
        System.out.println("Welcome to Constructor class");
    }
    student(String name,int age)
    {
        this("kavi",21,"Tiruppur");     //Construtor call must be the first statement inside the constructor
        System.out.println(name+age);
        
    }
    student(String name,int age ,String city)
    {
        System.out.println(name+age+city);
    }
}
public class day01_Constructor {
    public static void main(String[] args) {
        new student();
        new student("Kavivarshni",21);     //Constructo Overloading
    }
}
