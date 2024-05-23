class sample extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{
                System.out.println("Child Thread "+i);
                Thread.sleep(1000);                  //sleep method 
            }catch(InterruptedException d){
               System.out.println(" "+d.getMessage());
            }
        }
    }
}
public class day07_Threadsleep {
    public static void main(String[] args) {
        new Thread(new sample()).start();
        for(int i=0;i<10;i++)
        {
            try{
                System.out.println("Main Thread "+i);
                Thread.sleep(500);
            }catch(InterruptedException d){
               System.out.println(" "+d.getMessage());
            }
        }
    }
}


// Thread.sleep() functions, it always pauses the current thread execution.



/* 
     OUTPUT
Main Thread 0
Child Thread 0
Main Thread 1
Child Thread 1
Main Thread 2
Main Thread 3
Child Thread 2
Main Thread 4
Main Thread 5
Child Thread 3
Main Thread 6
Main Thread 7
Child Thread 4
Main Thread 8
Main Thread 9
Child Thread 5
Child Thread 6
Child Thread 7
Child Thread 8
Child Thread 9
 */