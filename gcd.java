import java.util.*;
public class gcd{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   calculateGcd(a, b);
   System.out.println(calculateGcd(a, b));
   System.out.println();
   
}
public static int calculateGcd(int a,int b)
{
    while(b!=0)
    {
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
}