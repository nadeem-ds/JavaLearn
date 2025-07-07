package nad;

//class ConcetereClass{
//    ConcetereClass(){
//        System.out.println("This is constructor of conveterec class");
//    }
//  public void display(){
//      System.out.println("Ths is conceterre class dipaly");
//  }
//}
//
//abstract class SuperClass{
//    SuperClass(){
//        System.out.println("Abstract class");
//    }

/// /    public void show(){
/// /        System.out.println("This is abstract class");
/// /    }
//   abstract public void show();
//}


abstract class Shape {
    abstract public double perimeter();

    abstract public double area();
}

class circle1 extends Shape {
    double radius;

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle11 extends Shape {
    double len;
    double breadth;

    public double perimeter() {
        return 2 * (len + breadth);
    }

    public double area() {
        return len * breadth;
    }
}


public class AbstractClass {
    public static void main(String args[]) {
        System.out.println("this is abstract class");
//        ConcetereClass c = new ConcetereClass();
//        c.display();
//
//        //it means you can not create a object of abstract class
//        //SuperClass sc = new SuperClass()
//        //but you can create reference of abstact class
//
//        SuperClass s ; //it will not give any error


        circle1 c2 = new circle1();
        c2.radius = 10;
        double carea = c2.area();
        double cperi = c2.perimeter();


        System.out.println("The area is " + carea + "perimter is " + cperi);

        Rectangle11 r11 = new Rectangle11();

        r11.len = 10;
        r11.breadth = 20;

        double r11area = r11.area();
        double r11perimeter = r11.perimeter();
        System.out.println("the length is " + r11area + "and breadth is " + r11perimeter);

    }
}
