package nad;

import java.util.Scanner;

public class ConditionalStatement {
    public  static void main(String args[]){
//        System.out.println("condition statement ");
//        String num;
//        System.out.println("Please Enter the Number ---");
//        Scanner s  = new Scanner(System.in);
//        num = s.nextLine();
//        //check wheather no is binary , hex and octal no
//        if(num.matches("[01]*")){
//            System.out.println("The given no is binary");
//        }else if(num.matches("[0-7]+")){
//            System.out.println("Given no is hexadecimal no");
//        }else if(num.matches("[0-9]+")){
//            System.out.println("No is decimal ");
//        }else if(num.matches("[0-9A-F]+")){
//            System.out.println("No is hexa decimal ");
//        }else{
//            System.out.println("This is not numbner");
//        }


//        System.out.println("Enter the year  ");
//        int year;
//        System.out.println("Please Enter the Number ---");
//        Scanner s1  = new Scanner(System.in);
//        year = s1.nextInt();

//        if(year%4==0){
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println(" leap year");
//
//                }else{
//                    System.out.println("Not leap year");
//
//                }
//            }else{
//                System.out.println(" leap year");
//            }
//        }else{
//            System.out.println("Not leap year");
//        }


        System.out.println("Enter the day no  ");
        int day;
        System.out.println("Please Enter the Number ---");
        Scanner s1  = new Scanner(System.in);
        day = s1.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesasdy");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurds");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not any day");
        }

    }
}
