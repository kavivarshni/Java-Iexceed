//Packages in Java
import packages.factorial;

class factorial4 extends factorial
{
    int n;
    factorial4(int n)
    {
        super(5);
     }
}
public class day08_package1
{
    public static void main(String[] args)
     {
           factorial4 f=new factorial4(5);
    }
}
