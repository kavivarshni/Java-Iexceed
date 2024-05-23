import java.lang.*;
class sample
{
    String name,dept;
    int rollno;                      //Instance Variables or global variables
    sample(String name,int rollno,String dept)   
    {
         this.name=name;
         this.rollno=rollno;
         this.dept=dept;
         this.display();//     this keyword is used to call the current class method 

         //display();          results in same output we can give this keyword else computer will take this keyword Implicitly
         System.out.println("This keyword refers the Current object address"+this);
    }
    public void display()
    {
        System.out.println("Name = "+ name +" Rollno = " + rollno + " Department = " + dept); 
    }
}
class display
{
    display()
    {
        this(10,20);      //Constructor Overloading
        System.out.println("Inside first constructor");
     }
    display(int x,int y)
    {
        System.out.println(x+y);
    }
}
public class day02 {
    public static void main(String[] args) 
    {
        System.out.println("Day 02 Assignment");
        new sample("Kavi   ",21,"CSE");
        sample s=new sample("Varshni",12,"ECE");
        System.out.println("***"+s);//this keyword is used to refer current Object address
        new display();
    
    }
}
