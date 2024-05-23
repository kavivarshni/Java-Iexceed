import java.util.Scanner;
//Array Of Objects
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
    


public class day04 {
    public static void main(String[] args) 
    {
        System.out.println("Day 04 ");
        int x=0;
       while(x<5)                                        //while loop
       {
            x+=1;
            System.out.println("n = "+x);
       }
       do{                                                //do while loop
            x+=1;
            System.out.println("n = "+x);
          
        }while(x<6);

                                                         //Pattern Program1
        System.out.println("Enter the value for n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
        System.out.println(" ");                         //Pattern Program2
        for(i=1;i<=n;i++)
        {
            for(k=0;k<=n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println(" ");                         //Pattern Program3
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println(" ");                           //Pattern Program4
        for(i=0;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println(" ");                           //Pattern Program5
        for(i=0;i<n;i++) 
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
      }
      //for(i=0;i<n;i++)
      //{
       // System.out.println(" ".repeat(n-i-1)+(String.valueOf(i+1)+"").repeat(i+1));
     // }
     for(i=1;i<=n;i++)                                   //Pattern Program6
    {
        for(k=1;k<=n-i;k++)
        {
            System.out.print("  ");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        for(j=2;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println("");
    }
    for(i=n-1;i>=1;i--)
    {
        for(k=1;k<=n-i;k++)
        {
            System.out.print("  ");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        for(j=2;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println("");
    }
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

