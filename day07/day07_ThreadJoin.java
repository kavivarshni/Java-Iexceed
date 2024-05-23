//join method --> it does allow another thread until current thread is executed


class sample extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(Thread.currentThread().getName()+" is running value = "+i);
        }
    }
}
public class day07_ThreadJoin {
    public static void main(String[] args) {
        Thread t1=new Thread(new sample(),"Thread-1");
        Thread t2=new Thread(new sample(),"Thread-2");
        t1.start();
        try
        {
            t1.join();   //It does not allow another thread to interrupt untill the current thread is executed
        }catch(InterruptedException d)
        { 

        }
        t2.start();
    }
}
