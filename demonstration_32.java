class circle{
    double r;
    double x,y;
    circle(double x,double y,double r){
        this.x=x; this.y=y; this.r=r;
    }
    circle(double r)
    {
        x=0;y=0;this.r=r;

    }
    circle(circle o){
        x=o.x;y=o.y;r=o.r;

    }
    circle(){
        x=0.0;y=0.0;r=1.0;
    }
    double circumference(){
        return 2*3.14*r;
    }
    double area()
    {
        return 3.14*r*r;
    }
}
class demonstration_32{
    public static void main(String[] args) {
        circle c1=new circle(3.0,4.0,5.0);
        circle c2=new circle(5.0);
        
        circle c3=new circle(c1);
        
        circle c4=new circle();
        System.out.println("circumference of circle 1"+c1.circumference());
        System.out.println("Area of circle"+c1.area());
        System.out.println("circumference of circle 1"+c2.circumference());
        System.out.println("Area of circle"+c2.area());
        System.out.println("circumference of circle 1"+c3.circumference());
        System.out.println("Area of circle"+c3.area());
        System.out.println("circumference of circle 1"+c4.circumference());
        System.out.println("Area of circle"+c4.area());
        

    }

}


