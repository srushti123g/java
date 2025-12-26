import java.util.*;
public class bonus {
    public static void function(int x,int n)
    {int m=1;
        for(int i=1;i<=n;i++)
        {//int m=1;
              m=x*m;
             //System.out.println(m);
        }
            System.out.println(m);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n **Program to print the x^n");
        System.out.println("Enter the value of x =");
        int x=sc.nextInt();
        System.out.println("Enter the value of n=");
        int n=sc.nextInt();
        System.out.println("The value of x raised to power n is =");
        function(x, n);
        System.out.println();
    }
}
