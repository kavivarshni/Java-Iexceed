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
public class thisKeyword {
    public static void main(String[] args) {
        sample s=new sample("Kavivarshni",27 , "CT-UG");
    }
}
