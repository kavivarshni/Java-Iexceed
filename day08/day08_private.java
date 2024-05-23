class sample1{
    private int age=21;
    sample1()
    {
        System.out.println("Private Access Specifier Accessible only within the class "+age);
        this.display();
    }
    public void display()
    {
        System.out.println("Private Access Specifier Accessible only within the class "+age);
    }
}
public class day08_private {
    public static void main(String[] args) {
        sample1 s=new sample1();
        
    }
}
