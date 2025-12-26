import java.util.*;
public class practice2{
    public static void main(String[] args)
    {
        System.out.println("Write a program to enter the number till the userwants and at the end it should display the count of positive negative and zeroes entered");  
       Scanner sc=new Scanner(System.in);
        int positivecount=0;
        int negativecount=0;
        int zerocount=0;
        char choice;
        do{
            int number=sc.nextInt();
            if(number>0)
            {
               positivecount++;
            }
            else if(number==0)
            {
                zerocount++;

            }
            else{
                negativecount++;
            }
            System.out.println("\nDo you want to print number?(y/n)\n");
             choice=sc.next().charAt(0);
            
        }while(choice=='y');
        System.out.println("positive numbers"+positivecount);
        System.out.println("negative numbers"+negativecount);
        System.out.println("zeroes entered"+zerocount);
    
    
        
}

    
}

    

