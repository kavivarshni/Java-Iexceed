class sample extends Thread
{
     public void run()
     {
        for(int i=0;i<3;i++)
        {
        System.out.println("Child = "+ i);
        }
     }
}
/*
MIN_PRIORITY =  1
MAX_PRIORITY = 10
NOR_PRIORITY =  5 (DEFAULT)    */

public class day07_ThreadPriority {
    public static void main(String[] args) {
       
        Thread t=new Thread(new sample());
        Thread t2=new Thread(new sample());
        Thread t3=new Thread(new sample());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        //t3.setPriority(Thread.NOR_PRIORITY); -->cannot assign normal priority as it is default
        System.out.println("MAX PRIORITY = "+Thread.currentThread().getPriority());
        System.out.println("MIN PRIORITY = "+t2.getPriority());
        System.out.println("NOR PRIORITY = "+t3.getPriority());
        t.start();
}
}
