//Multiple Threads using sleep method using multiple classes
class sample extends Thread
{
    public void run()
    {
        for(int i=1;i<10;i+=2)
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
class sample2 extends Thread
{
    public void run()
    {
        for(int i=2;i<10;i+=2)
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
public class day07_Threadsleep3 {
    public static void main(String[] args) {
        sample s=new sample();
        sample2 s2=new sample2();
        s.setName("Sample 1");
        s2.setName("Thread 2");
        s.start();
        s2.start();
    }
}



/*           OUTPUT
 Sample 1 is Running and the value is 1
Thread 2 is Running and the value is 2
Sample 1 is Running and the value is 3
Thread 2 is Running and the value is 4
Sample 1 is Running and the value is 5
Thread 2 is Running and the value is 6
Sample 1 is Running and the value is 7
Thread 2 is Running and the value is 8
Sample 1 is Running and the value is 9
 */