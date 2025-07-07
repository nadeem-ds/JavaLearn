package nad;
import java.lang.*;
import java.util.*;

public class KeywordScanner {
    public static void main(String args[]){
        System.out.println("Nadeem");
        takeinput(args);
    }
    //taking input from the user then print

    public static void takeinput(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 Number");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;

        //printing the data
        System.out.println("The Sum of 2 No is "+c);

    }
}
