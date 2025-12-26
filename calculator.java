import java.util.*;
public class calculator{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the operator");
        char operator=sc.next().charAt(0);
        int reurn;
        switch(operator)
        {
            case '+':

            System.out.println("the sum of a and b is");
            reurn = a+b;
            System.out.println(reurn);
            break;
            case '-':
            System.out.println("The difference of a and b is");
            reurn = a-b;
            System.out.println(reurn);
            break;

            case '*':
            System.out.println("The multiplication of a and b is");
            reurn = a*b;
            System.out.println(reurn);
            break;
            case '/':
            System.out.println("the division of a and b is");
            reurn = a/b;
            System.out.println(reurn);
            break;
            default:
            System.out.println("you enter wrong operator");

        }

    }
}