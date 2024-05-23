import java.util.*;
public class day06_strings 
{
    public static void main(String[] args) 
    {
        String name="Kavivarshni Muthurathinam";  //Creation of String by Literal(Without using new Keyword)so it stores in String constant pool
        String name1="Kavivarshni Muthurathinam";  //already this string is present so it won't create new memory rather it just 
                                                  //  return the refernce and assign it in the same memory
        String city=new String("Tiruppur");   // Creation by using new keyword.so it will be stored in heap memory
        System.out.println(city);
        System.out.println(name);
        name1=name1.concat("sumathi");
        System.out.println(name1);
        if(name1.contains("kavivarshni"))
        {
            System.out.println("Name is Present");
        }
        else if(name.equalsIgnoreCase("kavivarshni muthurathinam"))
        {
            System.out.println("Name is Found");
        }
        else
        {
            System.out.println("Name is NOT Found");
        }  

        //difference between == and equal() :
        String address="Tiruppur";
        String address1= new String("Tiruppur");  
        System.out.println(address==address1); // ==operator returns true only if refernces are same(Store in heap memory) otherwise false
        System.out.println(Objects.equals(address,address1));

        //concatention
        String hobby="Playing chess";
        String hobby2="dancing";
        int x=100;
        System.out.println(hobby+x);             //Concating String and integer
        System.out.println(hobby.concat(hobby2).concat(address));  //concat method can't concat String & int
        System.out.println(hobby+hobby2+x);       //Concating String and String and int
        //Mutable Strings(Changeable)
        StringBuffer s=new StringBuffer("Kavi");
        StringBuffer s2=new StringBuffer("Varshni");
        System.out.println(s.append(s2));     // + operato cannot be used since it is Mutable Strings
       
        //Using joiner method
        StringJoiner sj=new StringJoiner(" ");
        sj.add("Hi");
        sj.add("Welcome");
        sj.add("to");
        sj.add("java");
        System.out.println(sj.toString());

        //Using join method
        String arr[]={"welcome","to","Java","Programming"};
        String s3=String.join(" ",arr);
        System.out.println(String.join(" ", arr));     
        System.out.println(s3); 

        

    }
}
