public class day05 
{
    public static void main(String[] args) 
    {
        System.out.println("Day 05");
        final int MAX=100;                //Once final keyword is declared then it cannot be incremented or decremented
                                          //MAX++; Error:Cannot assign a value to a final variable MAX
       System.out.println("Final "+MAX);
       final int arr[]={1,2,3,4,5};
       int arr1[]={6,7,8,9,10};
       //arr=arr1;              ---> once array is declared as final it does not allow to reassigned
       sample s=new sample();
       
    }
}
 class sample   //final class sample  --->final class cannot be inherited(using extends)
{
    final public void sample1()
    {
        System.out.println("Once if class is declared as final it cannot be inherited");
    }
}
class student extends sample          
{
    public void student1()
    {
        System.out.println("Final references cannot be reassigned`");
    }
   //public void sample1()              //  --->Cannot override the final method
    //{}
}


