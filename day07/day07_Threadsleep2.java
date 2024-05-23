//Multiple Threads using sleep method using multiple Objects
class sample extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" is Running and the value is "+i );
            try{
                Thread.sleep(1000);
            }catch(InterruptedException d)
            {

            }
        }
    }
}
public class day07_Threadsleep2 {
    public static void main(String[] args) {
        sample s=new sample();
        sample s2=new sample();
        s.setName("Thread 1");
        s2.setName("Thread 2");
        s.start();
        s2.start();
    }
}



/*
            OUTPUT
Thread 1 is Running and the value is 0
Thread 2 is Running and the value is 0
Thread 2 is Running and the value is 1
Thread 1 is Running and the value is 1
Thread 2 is Running and the value is 2
Thread 1 is Running and the value is 2
Thread 2 is Running and the value is 3
Thread 1 is Running and the value is 3
Thread 2 is Running and the value is 4
Thread 1 is Running and the value is 4
 */
