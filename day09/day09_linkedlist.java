import java.util.Iterator;
import java.util.LinkedList;

public class day09_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        l.add("Kavi");
        l.add("Abhi");
        l.add("Priya");
        l.add("Ranjeeth");
      
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    System.out.println("***********After Pop *********8");
    l.pop();
    l.remove("Priya");
    for (String i : l) {
        System.out.println(i);
        
    }
}
}
