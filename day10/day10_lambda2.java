//without using implements calling the Interface
interface mydata
{
    public void show();
}

public class day10_lambda2 {
    public static void main(String[] args) 
    {
        //lambda expression->without implementing the interface
        mydata d=()->{
            System.out.println("Interface is overriden inside Main class");
        };
     
        d.show();
    }
   
}