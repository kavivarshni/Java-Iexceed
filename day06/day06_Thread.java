
class sample  implements Runnable
{
      sample()
      {
        System.out.println("Welcome to Thread Topic");
      }
      public void run()     //overriden method
      {
        System.out.println("Thread Run Method");
      }
}
public class day06_Thread {
    public static void main(String[] args) {
        sample s=new sample();
        Thread t=new Thread(s);
        t.start();
      
    }
}
