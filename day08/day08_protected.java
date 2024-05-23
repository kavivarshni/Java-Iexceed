
class sample{
    protected String name="Rio";
    protected int age=24;
    protected void display()
    {
        System.out.println(name+age);
    }
}
public class day08_protected {
    public static void main(String[] args) {
          sample s=new sample();
          s.display();
    }
}
