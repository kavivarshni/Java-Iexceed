import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class day09_linkedlistextract {
    public static void main(String[] args) {

        LinkedList l=new LinkedList<>();
        l.add("Kavi");
        l.add("Abhi");
        l.add("priya");
        l.add("deva");
        l.add("Ranjeeth");
        l.add("Kavi");
         l.poll();// remove firt element
   /*   boolean isremoved=l.removeFirstOccurrence("kavi");
        System.out.println(l.get(2));
        System.out.println(l.element());
        System.out.println(l.peek());
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        System.out.println(isremoved);*/
       
        System.out.println(l);
        l.removeIf(x->x.equals("Abhi")||(x.equals("priya")));
        System.out.println(l);

        //Splitertor 
        Spliterator s=l.spliterator();
        System.out.println("Traversed by Spliterator");
        s.forEachRemaining(ele->System.out.println(ele));

        
    }
}
