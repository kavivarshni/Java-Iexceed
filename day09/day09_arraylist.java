import java.util.ArrayList;
import java.util.Iterator;

public class day09_arraylist {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Kavi");
        a1.add("Sumathi");
        a1.add("Muthu");
        a1.add("Ranjeeth");
    //two methods for printing array list
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for (String iterable_element : a1) {
            System.out.println(iterable_element);
        }

    }
}
