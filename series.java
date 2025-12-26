import java.util.*;
public class series {
    public static void seriess(int n)
    {
        //fabonacci series
        int firstterm=0;
        int secondterm=1;
        int nextterm;
        for(int i=0;i<n;i++ )
        {
System.out.print(firstterm+" ");
nextterm=firstterm+secondterm;
firstterm=secondterm;
secondterm=nextterm;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of terms");
        int n=sc.nextInt();
        seriess(n);
System.out.println();
    }
    
}
