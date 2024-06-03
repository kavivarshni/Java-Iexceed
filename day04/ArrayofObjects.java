class student
{
    String name;
    int age;
    public void setname(String name)
    {
         this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setage(int age)
    {
         this.age=age;
    }
    public int getage()
    {
        return age;
    }
}

public class ArrayofObjects {
    public static void main(String[] args) {
         //Array of objects
    student s=new student();
    s.setname("Kavivarshni");
    s.setage(21);
    student s2=new student();
    s2.setname("Thanu");
    s2.setage(21);
    student s3=new student();
    s3.setname("Abhi");
    s3.setage(22);

     int i;
    student sobj[]=new student[3];
    sobj[0]=s;
    sobj[1]=s2;
    sobj[2]=s3;
    for(i=0;i<sobj.length;i++)
    {
        System.out.println(sobj[i].getname());
        System.out.println(sobj[i].getage());
       
    }
    }
}
