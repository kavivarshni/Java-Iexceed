class sample extends Thread{
    public void run()
    {
        System.out.println("Run Method");
    }
}
public class day07_Thread1 
{
    public static void main(String[] args) {
        new Thread(new sample()).start();
    }
}
