class sample extends Thread
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
public class day06_Thread2 {
    public static void main(String[] args) {
        sample s=new sample();
        sample s2=new sample();
        Thread t=new Thread(s);
        Thread t2=new Thread(s2);  
        t.start();            //Calling the run Method Automatically
        t2.start();           
    }
}
