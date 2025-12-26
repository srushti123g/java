import java.util.*;
public class loop {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //int marks=sc.nextInt();
    if(n==1){
        int marks=sc.nextInt();
        if(marks>=90)
        {
System.out.println("Tjis is good");
        }else if(89 >= marks && marks >= 60)
        {
            System.out.println("This is also good");
        }else
        System.out.println("this is good as well");


    }
    else{
        System.out.println("Stop");
    }
}
}
    
    /*if(n=1)

    {
        if(marks>=90)
        
           { System.out.println("this is good");}
            else if(89>= marks >=60)
            {
                System.out.println("this is also good");

            }
            else
            {
                System.out.println("This is good as well");
            }
        
        
        
    }
    else{
        System.out.println("Stop");
    }

    }
    
    
}*/
