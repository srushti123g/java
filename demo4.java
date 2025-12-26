import java.lang.*;
 class calculate{
    double i;
    double x=Math.sqrt(i);
}
class demo4{
public static void main(String args[]){
    calculate a=new calculate();
    a.i=Integer.parseInt(args[0]);
    System.out.println("square root of"+a.i+"is"+a.x);
}
}
