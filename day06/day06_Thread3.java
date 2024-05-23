class sample extends Thread{
    Thread t=new Thread();
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
            System.out.println("Child Thread "+i);
            }
        }
    }
}
public class day06_Thread3 {
    public static void main(String[] args) {
        sample s=new sample();
        Thread t=new Thread(s);
         t.start();
         
        for(int i=0;i<10;i++)
        {
            if(i%2==1)
            {
            System.out.println("Main Thread "+i);
            }
        }    
    }
}
