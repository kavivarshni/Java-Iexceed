class Yield extends Thread
{
     public void run()
     {
        for(int i=0;i<3;i++)
        {
            System.out.println("Child Thread " +i);
        }
     }
}
public class day07_ThreadYield {
    public static void main(String[] args) {
       Yield y=new Yield();
       Yield y2=new Yield();
       y.start();
       y2.start(); 
       for(int i=0;i<3;i++)
       {
        Thread.yield();
        System.out.println("Main Thread" +i);
       
       }
    }
}
