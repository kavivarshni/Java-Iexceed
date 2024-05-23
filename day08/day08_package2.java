//importing sub classes in package
import packages.*;
class maths extends calc
{
    maths()
    {
    super(10,2,'*');
    }
}
public class day08_package2 {
    public static void main(String[] args) {
        maths m=new maths();
        
    }
}
