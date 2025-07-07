package nad;

import java.util.Scanner;

class Circle {
    public double radius ;

    public  double area(double radius){
        return Math.PI*radius*radius;
    }
    public  double perimeter(double radius){
        return 2*Math.PI*radius;
    }
}

class Rectangle {
    private double length;
    private double breath ;


    //Create a getter and setter

    public double getLength(){
        return length;
    }
    public double getBreath(){
        return breath;
    }

    public void setLength(double l){
        if(l>0){
            length = l;

        }else{
            length = 0;
        }
    }

    public void setBreath(double b){
        if(b>0){
            breath = b;
        }else{
            breath = 0;
        }
    }

    public

     double area(){
        return getLength() * getBreath();
    }
    public double perimeter(){
        return 2*(getLength()+getBreath());
    }
}

//cyclinder
class Cycliner {
    public double radius;
    public double height ;

    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2 *lidArea() + perimeter() *height;
    }
    public double volume(){
        return lidArea() *height;
    }
    public double perimeter () {
        return 2 * Math.PI * radius;
    }


}

class Student {
    public int roll;
    public String name;
    public String course ;
    public int m1 ,m2 , m3;

    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (double) (m1 + m2 + m3) /3;
    }
    public String grade(){
        if(average()>60){
            return "A";
        }else{
            return "F";
        }
    }
}

public class OOPSPractice {
    public static void main(String args[]){
//        System.out.println("This is practice of the OOPS in java ");
//        Circle c1 = new Circle();
//        System.out.println("Enter radius");
//        Scanner s = new Scanner(System.in);
//        double rad = s.nextDouble();
//        double a = c1.area(rad);
//        double p = c1.perimeter(rad);

        System.out.println("Rectange start");
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setBreath(20);
//        r.length = 10;
//        r.breath = 20;

        System.out.println("The final resposne of the rectangle is " + r.area() + r.perimeter());
        System.out.println("the length and breadth is "+r.getLength() + r.getBreath());

//        System.out.println("the final result is Area "+ a + " perimeter is "+ p);

        //cyclinder start

//        Cycliner cy = new Cycliner();
//
//        cy.radius = 10;
//        cy.height = 20;
//
//        System.out.println("The final result of the cyclinder is "+cy.lidArea() + cy.perimeter() + cy.totalSurfaceArea() + cy.volume());


        //student exersise

//        Student SS = new Student();
//        SS.roll = 12;
//        SS.name = "Nadeem";
//        SS.course = "9th";
//        SS.m1 = 23;
//        SS.m2 = 74;
//        SS.m3 = 92;
//
//        System.out.println("The student result is "+SS.average());
//        System.out.println("Total is "+SS.total());
//        System.out.println("Studen Grade "+SS.grade());

    }
}
