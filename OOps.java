import java.util.*;
import Banks;
class Pen{
    String color;
    String type;//ballpoint pen or jel pen
    public void write(){
    System.out.println("Writting Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    Pen(){
        System.out.println("pen constructor called");
    }
}
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    Student(){
        System.out.println("student constructor called");
    }

}
class Note{
    String name;
    int page;
   /*  Note(String name,int page){//parameterized constructor
        this.name=name;
        this.page=page;
    }*/
     public void printinfo(String name,int page){
        System.out.println(this.name);
        System.out.println(this.page);
    }
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int page){
        System.out.println(page);
    }
   // Note(Note n2){//copy constructor
     //   this.name=n2.name;
       // this.page=n2.page;
    //}
    Note(){//non parameterized constructor

    }
    
}

//inheriatance
//base class
class Shape{
    public void area(){
        System.out.println("DIsplays area");
    }
}
//derived class
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Equlateraltriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
class Circle extends Shape{
    System.out.println((3.14)*r*r);
}
public class OOps {
    public static void main(String[] args){
        Pen pen1=new Pen();//alocate that place with the help of object
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();//to call the above method
        Pen pen2=new Pen();
        pen2.color="yellow";
        pen2.printColor();
        pen1.printColor();
        Student s1=new Student();
        s1.name="Srushti";
        s1.age=23;
        s1.printinfo();
       // Note n1=new Note("math",89);
       Note n1=new Note();
       n1.name="math";
       n1.page=45;
       //Note n2=new Note(n1);
        n1.printinfo(n1.name,n1.page);
        Banks.Account account1=new Banks.Account();
        account1.name="Customer1";






    }

    
}
