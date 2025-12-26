import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //to print the pattern
        /****
        ****
        ***** */
       /*for(int i=1;i<5;i++)
       {for(int j=1;j<9;j++){
        System.out.print("*");
       }
       System.out.println("");
    }
    to print 
    *****
    *   *
    *   *
    *****
    
    for(int i=1;i<5;i++)
    {
        for(int j=1;j<6;j++)
     if(i==1||j==1||i==4||j==5)
     {
        System.out.print("*");
    
     }else
     {
        System.out.print(" ");
     }
     System.out.println("");
    }
    
    to print the pattern
hallf pyramid
    *
    **
    ***
    ****
    
    for(int i=1;i<5;i++)
{
    System.out.println();
    for(int j=1;j<=i;j++)
   { System.out.print("*");
} 
   }
   invert pyramid
   ****
   ***
   **
   *

for(int i=4;i>0;i--)
{
    for(int j=1;j<=i;j++)
    {System.out.print("*");
}
System.out.println();
  }
  

  to print pattern
     * 3 space 1 star 4-1 spaces i
    ** 2 space 2 star 4-2
   *** 1 space 3 star 4-3
  ****  0 space 4 star 4-0
  here have the logic
  here we have 4 rows


for(int i=1;i<=5;i++)
{
    for(int j=1;j<=(5-i);j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
} 

to print pattern
1
12
123
1234
12345

for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j+"*");
    }
    System.out.println();


}
to print inversted half pyramid with numbers
1234
123
12
1
*/
for(int i=1;i<5;i++)
{
    for(int j=1;j<(6-i);j++)
    {
        System.out.print(j);
    }
    System.out.println();
}
}
}

