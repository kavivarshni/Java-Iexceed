import java.util.Scanner;

public class patternprograms {
    public static void main(String[] args) {
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
    }
}
