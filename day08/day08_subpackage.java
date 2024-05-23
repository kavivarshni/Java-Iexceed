//Sub Package in Java
import packages.kavi.information;           //Sub package ->folder Kavi
class sample1 extends information
{
    sample1()
    {
        super("Kavi",21);
    }

}
public class day08_subpackage {
    public static void main(String[] args) {
        sample1 s=new sample1();
    }
}
