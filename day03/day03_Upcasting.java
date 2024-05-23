//Upcasting in Java
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
public class day03_Upcasting {
    public static void main(String[] args) {
        System.out.println("Upcasting in Java");
        pen pn=new pencil();               // Upcasting Pen
        pn.tip();
    }
}
