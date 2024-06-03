class display
{
    display()
    {
            
        System.out.println("Inside first constructor");
     }
    display(int x,int y)
    {
        this(); 
        System.out.println(x+y);
    }
    display(String name,int age)                                    //Constructor Overloading
    {
        System.out.println(name+" "+age);
    }
}
public class constructoroverloading {
    public static void main(String[] args) {
        new display(10,20); 
        new display("Kavivarshni",27 );
    }

}
