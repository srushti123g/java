import java.util.*;
public class SimpleArrayList {
public static void main(String args[]){
    int sum=0;
    int avg=0;
    ArrayList <Integer> l=new ArrayList<Integer>();
    System.out.println("enter the input");
    Scanner in=new Scanner(System.in);
    while(in.hasNextInt())
    {
        l.add(in.nextInt());
    }
for(int i=0;i<l.size;i++){
    sum=sum+l.get(i);
}
avg=sum/(l.size());
System.out.println("Average"+avg);
}    

}
