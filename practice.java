import java.util.*;
public class practice {
    public static void average(int a,int b,int c)
    {
        double average;
        int sum;
        sum=a+b+c;
        average=sum/2;
        System.out.println("the average of three numbers is ="+average);
    }
    public static void sumOdd(int n)
    { int sum=0;
        for(int i=1;i<=n;i++)
        {
            //int sum=0;
            if(i%2!=0){
            sum=i+sum;}
//System.out.println(sum);

        }
        System.out.println("sum of all odd numbers till n is = "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to find average of three numbers\n");
        System.out.println("Enter the first number a=");
        int a=sc.nextInt();
        System.out.println("Enter the second number b=");
        int b=sc.nextInt();
        System.out.println("Enter the third number c=");
        int c=sc.nextInt();
        average(a, b, c);
        System.out.println("\n\n   *program to find sum of all odd numbers till n**\n");
        System.out.println("Enter the n natural numbers");
        int n=sc.nextInt();
        sumOdd(n);
        System.out.println();

        System.out.println("\n\n **program to find greater number**");
        System.out.println("\n\n Enter the first number=");
        int d=sc.nextInt();
        System.out.println("Enter the second number =");
        int f=sc.nextInt();
        greater(d, f);
        System.out.println();
        System.out.println("\n\n program to find the circumference of circle");
        System.out.println("\n\n Enter the radius of circle =");
        int r=sc.nextInt();
        circumference(r);
        System.out.println();
        System.out.println("\n\n **Program to find person is eligible for vote or not");
        System.out.println("\n Enterr the age of a person =");
        int m=sc.nextInt();
        age(m);
        System.out.println();
            
        
        
    }
    public static void greater(int d,int f)
    {
        if(d>f)
        {
            System.out.println("the greater number is ="+d);
        }
        else if(d==f)
        {
            System.out.println("both numbers are equal");
        }
        else
        {
            System.out.println("The greater number is ="+f);
        }
    }
    public static void circumference(int r)
    {
        double circumference=2*3.14*r;
        System.out.println("The circumference of a circle is ="+circumference);
    }
    public static void age(int m)
    {
        if(m>18)
        {
            System.out.println("the person is eligible for vote");
        }
        else{
            System.out.println("Person is not eligile for vote");
        }
    }
} 
