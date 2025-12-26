import java.util.*;
public class loops {
    public static void main(String[] args)
     {
        System.out.println("Enter value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //a++ ==a+1
        int mul=1;
        //int i=0;
/*while(i<100)
{
    System.out.print(i);
    i=i+2;
    System.out.println("   Hello Srushti");
}*/
/*do{
    //System.out.print(sum);
    sum=sum+i;
     i++;
}
while(i<n);
System.out.println(sum);
    }*/
    for(int i=1;i<=10;i++) 
    {
        mul=i*n;
        System.out.println(mul);
    }
}

    
}
/*
 * loops means repeat work again and again
 * for(initialisation;condition;updation)
 * 
 * while(condition)
 * {
 * }
 * do
* {
    do something
}while(condition);
 */
