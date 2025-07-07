package nad;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Operator {
    public static void  main(String args[]){
        System.out.println("operator");

        int a = 20;
        int b = 15;

        int c = a%b;

        System.out.println("Res------"+c);

        byte x = 10;
        short y = 20;

        int z = x+y; // if we will write byte then it will give error because of type conversion
        // but in case of int it will not give any error

        //find the area of triangle
        //first take the input then multiply with formula
//        float i,j,area;
//        System.out.println("Enter the given data");
//        Scanner s = new Scanner(System.in);
//        i= s.nextFloat();
//        j= s.nextFloat();
//        area = (i*j)/2;
//        System.out.println("Area of triangle is --" +area);


        //make one more area also

//        int a1,a2,a3;
//        float s2;
//        double area1;
//
//        Scanner s1 = new Scanner(System.in);
//        System.out.println("Please enter the Number");
//        a1 = s1.nextInt();
//        a2 = s1.nextInt();
//        a3 = s1.nextInt();
//        s2 = (a1+a2+a3)/2f;
//
//        area1 = Math.sqrt(s2*(s2-a1)*(s2-a2)*(s2-a3));
//
//        System.out.println("The  final area of trainle is " + area1);


        //Quadratic equations

        int q1,q2,q3;
        double r1,r2;

        Scanner S4 = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        q1 = S4.nextInt();
        q2 = S4.nextInt();
        q3 = S4.nextInt();
        double sqrt = Math.sqrt(q2 * q2 - 4 * q1 * q3);
        r1 = (-q2+ sqrt)/2*q1;
        double sqrt1 = Math.sqrt(q2 * q2 - 4 * q1 * q3);
        r2 = (-q2- sqrt1)/2*q1;

        System.out.println("The value of quadratic equations is " + r1 + r2);
    }
}
