import java.util.*;
public class strings
 {
public static void main(String args[]){
    String name="srushti";
    String fullname="Srushti vishnu Gadakh";
    Scanner sc=new Scanner(System.in);
    String names=sc.nextLine();
    System.out.println("your name is "+names);
    System.out.println(names.length());
    //charAt
    for(int i=0;i<names.length();i++)
    {
        System.out.println(names.charAt(i));
    }
//to compare string
String name1="srushti";
String name2="drushti";
//s1>s2 :+ve value
//s1=s2 :0
//s1<s2 :-ve value
if(name1.compareTo(name2)==0){
    System.out.println("Strings are equal");


}
else
{
    System.out.println("Strings are not equal");
}
String sentence="my name is srushti";
//substring(beg index,end index)
//to print only the main part of the program
String named=sentence.substring(11,sentence.length());
System.out.println(named);



}


}
