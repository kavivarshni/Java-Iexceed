import java.util.LinkedList;

public class day09_Linkedlistsearch {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");
        System.out.println(l.indexOf("C"));
        System.out.println(l.indexOf("K"));//if the obj is not presented in list then it returns -1
        int x=l.indexOf("C");                 //method 1
        if(x!=-1)
        {
            System.out.println("Element is available");
        }
        else{
            System.out.println("Element is Not Available");
        }
        Boolean y=l.contains("E");             //method 2
        if(y==true)
        if(x!=-1)
        {
            System.out.println("Element is available");
        }
        else{
            System.out.println("Element is Not Available");
        }
        int x1=l.lastIndexOf("9");              //method 3
        if(x1!=-1) 
        {
            System.out.println("Element is available");
        }
        else{
            System.out.println("Element is Not Available");
        }
    }
}
//difference between indexof() and lastindexof() is that indexof search from head 
//and lastindexof search from tail
