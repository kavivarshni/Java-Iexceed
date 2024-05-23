//downcasting in java
class pen
{
    public void tip()
    {
        System.out.println("Super class is calling");
    }
}
class pencil extends pen
{
    public void tip()
    {
        System.out.println("derived class is calling");
    }
    public void tipbox()
    {
        System.out.println("Java is Safe in typecasting this method cannot be called because it allouws only to call the methods with same name ");
    }
}
public class day03_downcasting {
    public static void main(String[] args) {
        pen p=new pencil();                //downcasting
        pencil c=(pencil)p;
        c.tip();
    }
}
