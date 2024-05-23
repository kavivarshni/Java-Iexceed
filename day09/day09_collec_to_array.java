import java.util.LinkedList;

public class day09_collec_to_array {
    public static void main(String[] args) {
         LinkedList<String> l=new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");
        Object resarray[]=l.toArray();
        for(Object i:resarray)
        {
            System.out.println(i);
        }

    }
}
