
public class day10_anonymous2 extends Thread{
    public static void main(String[] args) {
        new Thread(){                     //Anonmous Function
            public void run()
            {
                for(int i=0;i<9;i++)
                {
                    System.out.println(i);
                }
            }
        }.start();
    }
}
