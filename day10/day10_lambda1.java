//without using implements calling the Interface
interface mydata
{
    public void show();
}
public class day10_lambda1 {
    public static void main(String[] args) 
    {
        mydata d=new mydata() {
            public void show()
            {
            System.out.println("Interface is overriden inside Main class");
            }
        };
        d.show();
    }
   
}
