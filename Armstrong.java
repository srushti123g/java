import java.util.*;
import java.lang.Math;
import java.
public class Armstrong {
    //Armstrong number is a positive m digit number is equal to sum of mth powers of their digits
    //it is also known as pluperfect or plusperfect or narcissistic number
    //ex::1^1=1
    //153=1^3+5^3+3^3;
    static boolean isArmstrong(int n)
    {
        int temp,digits=0,last=0,sum=0;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp>0)
        {
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(n==sum)
        return true;
        else return false;

    }
    public static void main(String[] args)
    
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        num=sc.nextInt();
        System.out.println("Armstron number up to"+num+"are:");
        for(int i=0;i<=num;i++)
        if(isArmstrong(i))
        System.out.print(i+",");
    }


    
}
