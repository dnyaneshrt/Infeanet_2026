package oops;

class Shape
{
    double area()
    {
        return 0;
    }
}

class Rectangle extends  Shape{
    int length, breadth; //instance variable

    //cons are used to initialize instance variables at the time of object creation
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area()
    {
        return length*breadth;
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    double area()
    {
        return 3.14*radius*radius;
    }
}

class Triangle extends Shape{
    int length, breadth; //instance variable

    //cons are used to initialize instance variables at the time of object creation
    public Triangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area()
    {
        return 0.5*length*breadth;
    }
}

public class RTPolyTest {
  /*  public void printAreaOfRectangle(Rectangle rectangle)
    {
        System.out.println("area: "+rectangle.area());
    }

    public void printAreaCircle(Circle circle)
    {
        System.out.println("area: "+circle.area());
    }

    public void printAreaTriangle(Triangle triangle)
    {
        System.out.println("area: "+triangle.area());
    }*/

    public void printArea(Shape shape)
    {
        System.out.println("area: "+shape.area());
    }

    public static void main(String[] args) {

        RTPolyTest rtPolyTest=new RTPolyTest();
       /* Rectangle rectangle=new Rectangle(10,5); //at the time of object creation
        rtPolyTest.printAreaOfRectangle(rectangle);

        Circle circle=new Circle(10);
        rtPolyTest.printAreaCircle(circle);

        Triangle triangle=new Triangle(10,6);
        rtPolyTest.printAreaTriangle(triangle);
*/
        System.out.println("By using upcasting");
        rtPolyTest.printArea(new Rectangle(10,5));
        rtPolyTest.printArea(new Circle(10));
        rtPolyTest.printArea(new Triangle(10,6));

    }
}
