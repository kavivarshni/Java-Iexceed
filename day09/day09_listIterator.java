import java.util.LinkedList;
import java.util.ListIterator;

public class day09_listIterator {
    public static void main(String[] args) {
        
        LinkedList<String> l=new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");
        
        ListIterator<String> li=l.listIterator();
        System.out.println("ForWard direction");
        while (li.hasNext()) {  
            System.out.println("Next = "+li.next());  
        } 
        System.out.println("BackWard direction");
        while(li.hasPrevious())
        {
            System.out.println(" previous = "+li.previous());        
        }
      l.forEach(element->System.out.print(element));

      for(String s:l)
      {
           System.out.print(s);
      }
    }
}
