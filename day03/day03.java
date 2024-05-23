
// Static Method
class static1
{
    static int x;
    static
    {
        x=200;
        display();
    }
    static public void display()
    {
        System.out.println("Static Method is called "+x);
    }
    {
        System.out.println("Instance block is printed");          // Instance block is called when the object of the class is created
    }
    
}
class Variable1
{
    static int count=0,x=10;                           //Static variable -> it shared amoung all classes not to a particular object
    int y=100;
    public void display()
    {
        count++;
        System.out.println(count);
    }
    static public void show()              //Static Method
    {
       // System.out.println(y);                    //Cannot access Non static variable in static method
         Variable1 v=new Variable1();
         System.out.println("Static Variable = "+x);
         System.out.println("Non Static Variable = "+v.y);          //To access Non static variable declare obj reference 
    }
   
}
public class day03 
{
    public static void main(String[] args) 
    {
        System.out.println("Day -03");
      

        
        new Variable1().display();
        new Variable1().display();      //whenever object is created count is Incremented 
        new Variable1().show();
        new static1();
    }
}
