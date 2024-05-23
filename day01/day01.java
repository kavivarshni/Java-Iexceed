//Operators in Java
class operators
{
operators(int x,int y)
{
        System.out.println("  Relational Operators");      
        System.out.println(x<y);
        System.out.println(x<=y);
         System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(" Logical Operators");
         System.out.println((x>y) && (x==y));
}
}
class grade
{
grade()
{
int marks=78;
        if(marks<50)
        {
            System.out.println("Reappear");             //if else if statement
        }
        else if((marks>=50)&&(marks<60))
        {
            System.out.println("Your Grade is : B");
        }
        else if((marks>=60)&&(marks<70))
        {
            System.out.println("Your Grade is : B+");
        }
        else if((marks>70)&&(marks<80))
        {
            System.out.println("Your Grade is : A");
        }
        else if((marks>=80) && (marks<=100))
        {
            System.out.println("Your Grade is : A++");

        }
        else
        {
            System.out.println("Enter a Valid marks");
         }
}
public void getdata(String name,int age)     // Paramaters or Formal Arguments
{
System.out.println(name+" " +age);
}
}
class sample                                //Constructor Class
{
sample()
{
System.out.println("Welcome to Constructor class");
}
}

class incredecre                                    // Increment decrement Operator 
{
    int x=10;
    public void incrementOperator()
    {
          System.out.println("Pre Increment");
          System.out.println(++x);
          x=10;
          System.out.println("Post Increment");
          System.out.println(x++);
    }
    public void decrementOperator()
    {
          System.out.println("Pre decrement");
          System.out.println(--x);
          x=10;
          System.out.println("Post decrement");
          System.out.println(x--);
    }
}

public class day01
{
public static void main(String args[])
{
System.out.println("Range in java ");
System.out.println("Operators ");
new operators(10,20);
System.out.println("Conditional Operators");
grade g=new grade();
g.getdata("Kavivarshni",21);                //Actual Value or Arguments
new sample();
new incredecre().incrementOperator();
new incredecre().decrementOperator();

}
}
