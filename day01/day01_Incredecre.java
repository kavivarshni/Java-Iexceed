class incredecre                                    // Increment decrement Operator 
{
    int x=10;
    public void incrementOperator()
    {
          System.out.println("Pre Increment");
          System.out.println(++x);
          x=10;
          System.out.println("Post Increment");
          System.out.println(x++);
    }
    public void decrementOperator()
    {
          x=10;
          System.out.println("Pre decrement");
          System.out.println(--x);
          x=10;
          System.out.println("Post decrement");
          System.out.println(x--);
    }
}
public class day01_Incredecre {
    public static void main(String[] args) {
        incredecre i=new incredecre();
        i.incrementOperator();
        i.decrementOperator();
    }
}

/* Output :

Pre Increment
11
Post Increment
10
Pre decrement
9
Post decrement
10
 
*/