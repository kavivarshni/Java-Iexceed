import java.lang.reflect.Method;
class sample
{
    
    private void display()
    {
        System.out.println("Private method is accessible");
    }
}
public class day08_privateacessible {
    public static void main(String[] args) throws Exception {
       
        Class c=Class.forName("sample");
        Object o=c.newInstance();
        Method m=c.getDeclaredMethod("display",null);
        m.setAccessible(true);
        m.invoke(o);
   }
}
