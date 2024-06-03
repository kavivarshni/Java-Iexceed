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
}
public class day01_switch {
    public static void main(String args[])
    {
        grade g=new grade();
    }
}
