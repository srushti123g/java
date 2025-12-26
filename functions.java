import java.util.*;
public class functions {
    public static int calculateSum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        //function is a block of code which take inpt do some operations and produce output
        //example:thermometer,volume button of mobile phone
        //syntax returntype functionName(type arg1,type arg2,....)
        //return type int,float,string____
        //public and static are also return type
        //what happens in memory
        //in stac formation like books,plates
        
        Scanner sc=new Scanner(System.in);
        //String name=sc.next();
        System.out.println("Enter the number a");
        int a=sc.nextInt();
        System.out.println("Enter the number b");
        int b=sc.nextInt();
        //System.out.println("The sum of two numbers is =");
        int sum=calculateSum(a, b);
        System.out.println("sum of two numbers is="+sum);
         //calculateSum(a, b);
        //printMyName(name);
        //int a=sc.nextInt();
    //int b=sc.nextInt();
    
    int mult=calculateMul(a, b);
    System.out.println("the product of two numbers is ="+mult);
    //Scanner sc=new Scanner(System.in);
    //int a=sc.nextInt();
    int fact=calculatefact(a);
    System.out.println("the factorial of a is ="+fact);
    //Scanner sc=new Scanner(System.in);
    //int a=sc.nextInt();
    //int isprime=isprime(a);
    isprime(a);
    //System.out.println();
    //Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number n");
    int n=sc.nextInt();
    evenOrodd(n);
    System.out.println();
    //Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number m");
    int m=sc.nextInt();
    System.out.println("the table of given number is");
    table(m);
    System.out.println();

    }
// make a function to multiply 2 numbers and return the product
public static int calculateMul(int a,int b)
{
    int mult=a*b;
    return mult;
}
/*public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int mult=calculateMul(a, b);
    System.out.println("the product of two numbers is ="+mult);
}*/


//find the factorial of a number
public static int calculatefact(int a)
{
    int fact=1;
    if(a<0)
    {
        System.out.println("invalid number");
    }
    
    for(int i=a;i>=1;i--)
    {
        fact=fact*i;
        //System.out.println(fact);
    }
  System.out.println(fact);

    //int fac;
    return fact;
}
/*public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int fact=calculatefact(a);
    System.out.println(fact);
}*/

//make a function to check if a number is prime or not
public static void isprime(int a)
{
    boolean isprimes=true;
    for(int i=2;i<=a/2;i++)
    {
        if(a%i==0){
        isprimes=false;
        break;
        }
    }
        if(isprimes)
        {
           // System.out.println("The number is neither prime nor composite");
        
        if(a==1)
        {
            System.out.println("the number a is neither prime nor composite");
        }
        else{
            System.out.println("The number a is prime");
        }
    }
    else{
        System.out.println("The number a is composite");
    }

}

/*public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    //int isprime=isprime(a);
    isprime(a);
    //System.out.println();
}*/

public static void evenOrodd(int n)
{
    if(n%2==0)
    {
        System.out.println("given number is even");
    }
    else
    {
        System.out.println("given number is odd");
    }
} 
/*public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    evenOrodd(n);
    System.out.println();

}*/ 

public static void table(int m)
{
    
    for(int i=1;i<=10;i++)
    {
        int n=m*i;
        System.out.println(n);
    }
    System.out.println();
} 
/*public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    table(m);
    System.out.println();
} */

}
