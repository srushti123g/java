abstract class Animal{//it is a blueprint which only exist it will not use we can create it
    abstract void walk();
    static String school;
    public static void changeschool(){
        school="new School";
    }
    Animal(){
        System.out.println("you are creating a new animal");
    }
    
    public void eat(){
        System.out.println("Animals eat");
    }
}
interface Bird{
    public void fly();
}
interface Herbivore {

}

class Sparrow implements Bird, Herbivore{
    public void fly(){
        System.out.println("Walks on 4 legs");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class abstracts {
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.walk();
        Chicken c1=new Chicken();
        c1.walk();
        h1.eat();
        //Animal a1=new Animal();
        Sparrow s1=new Sparrow();
        s1.fly();
Horse.school="BVB";
System.out.println(h1.school);
    }
    
}
