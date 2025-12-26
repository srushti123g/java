//A program that uses the circle class
//call this file demonstration_31.java
class circle{
    double x,y;//the coordinates of circle
    double r;//radius
    //method that returns circumference
    double circumference(){
        return 2*3.14159*r;

    }
    //method that return AREA
    double area()
    {
        return (22/7)*r*r;

    }}
    class box{
        int height;
        int width;
        int depth;
        int area()
        {
            return (height*width+width*depth+height*depth)*2;
        }
        int volume()
        {
return height*width*depth;
        }
    }
    //the following class declares an object of type circle
    public class demonstration_31{
        public static void main(String[] args){
            circle c=new circle();
            circle c1=new circle();
            box b=new box();
            c.x=3.0;
            c.y=4.0;
            c.r=5.0;
            b.depth=3;
            b.height=6;
            b.width=9;
            c1.x=-3.0;
            c1.y=-4.0;
            c1.r=-5.0;
            System.out.println("Circumference"+c.circumference());
            System.out.println("Area"+c.area());
            System.out.println("Circumference"+c1.circumference());
            System.out.println("Area"+c1.area());
            System.out.println("Area of box"+b.area());
            System.out.println("Volume of box"+b.volume());
        }
    }


