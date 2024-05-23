//java treats like inner class as regular member
class games 
{
    
    games()
    {
        System.out.println("Welcome to Game World");
        display();
       
    }
    public void display()
    {
        System.out.println("1.chess 2.Throwball");
    }
    class chess
    {
        chess()
        {
            chessqueen();
        String name="***Chess***";
        System.out.println(name);
        }
        public void chessqueen()
        {
            System.out.println("Chess is the Queen of the game");
        }
    }
    protected class Throwball      //protected can used inside nested class
    {
        Throwball()
        {
        String name="***Throwball***";
        System.out.println(name);
        Throws();
        }
        public void Throws()
        {
            System.out.println("Throws your sorrows ");
        }
    }
}
public class day10_lambda3 {
    public static void main(String[] args) {
        games g=new games();
        games.chess c=g.new chess();
        games.Throwball t=g.new Throwball();

    }
}
