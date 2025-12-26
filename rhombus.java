import java.util.*;
public class rhombus {
    public static void main(String[] args){
    /*
    to print rhombus
    for(int i=1;i<6;i++)
    {
        for(int j=1;j<=(5-i);j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<6;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<6;i++)
    {
        for(int j=1;j<4-i;j++)
        //if()
            //for(int n=1;n<=(6-i);n++)
            {System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {System.out.print(i);
    }
        System.out.println();
    }
    
    to print 
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5

     
    for(int i=1;i<6;i++)
    {
        for(int j=1;j<6-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    print the palindromic pattern
        1
       212
      32123
     4321234
    543212345
    */
for(int i=1;i<6;i++)
{
    for(int j=1;j<=6-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=i;j>=1;j--)
    {
        System.out.print(j);
            }
        for(int j=2;j<=i;j++)
        {
            System.out.print(j);
        }
        
        
    
    System.out.println();
}


}
}