import java.util.*;
public class array {
    public static void main(String args[]){
        int[] marks=new int[3];
        marks[0]=98;//phy
        marks[1]=99;//chem
        marks[2]=97;//math
        
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //if you use marks only they will not print the actual value it will print the garbage value
        //if you want to print the marks then use [0]
        //to print numbers by easy method
        for(int i=0;i>3;i++)
        {
            System.out.println(marks[i]);
        }
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }
        int x=sc.nextInt();

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==x)
            {
                System.out.println("x found at this index"+i);
            }
            System.out.println("the numbers are"+numbers[i]);
        }
    }

}
