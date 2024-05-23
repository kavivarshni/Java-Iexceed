import java.util.Scanner;

public class day04ctrlstmts 
{
    public static void main(String[] args) 
    {
         int i,j,n=10;
         for(i=1;i<n;i++)
         {
            System.out.print(i);
            if(i==3)
            {
                break;                      //if condiition becomes false,break stmt Comes out of the loop Immediately
            }
         }
         for(i=1;i<n;i++)
         {
            if(i==3)
            {
                continue;                   //if condiition becomes false,continue stmt just skips the Current iteration only
            }
            System.out.print(i);
        }
        //int x[]=new int[3];
        //int[] x[]=new int[3];             Valid Syntax for declaring array
        //int []x=new int[4];
        int ar[]={1,2,3,4,5};             //Initializing array values
        for(i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("Enter Your Array Numbers");
        Scanner sc=new Scanner(System.in);      //One dimensional Array
        int arr[]=new int[3];
        for(i=0;i<3;i++)
        {
                arr[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            System.out.print(" "+arr[i]);
        }
        String course[]={"Java","Python","JavaScript","React"};
        course[1]="react";                         //Mutable
        for(i=0;i<course.length;i++)
         {
            System.out.println(course[i]);
         }


         int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};          //Two dimensional Array with User Input
         for(i=0;i<3;i++)
         {
            for(j=0;j<3;j++)
            {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println("");
         }

         int arr2[][]=new int[3][3],x=0;              //Two dimensional array with default values
         for(i=0;i<3;i++)
         {
            for(j=0;j<3;j++)
            {
              arr2[i][j]=x;
              x+=5;
            }
            System.out.println("");
         }
         for(i=0;i<3;i++)
         {
            for(j=0;j<3;j++)
            {
                System.out.print(" "+arr2[i][j]);
            }
            System.out.println("");
         }
    }
    
}
