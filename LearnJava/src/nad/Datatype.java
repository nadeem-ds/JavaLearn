package nad;

public class Datatype {
    public static void main(String args[]){



//        System.out.println("Datatype");
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        //byte data type
        byte b=127;
        System.out.println(b);
        b=23;
        System.out.println(b);

        //integer data type
        int a =20;
        System.out.println(a);

        //float
        float f = 12.2f;
        System.out.println((f));

        //boolean
        boolean d = false;
        System.out.println(d);

        //rules for giving variable name
        //1. Do not start with no
        //2. Do not start with  special character
        //3. Should not used any keywords
        //4. don't use build in class name
        //5. Follow camel case
        //6. Start with alphabet not special character


        int x = 12;
//        float x = 23; // it will give error
        int X = 144;

        System.out.println(x);
        System.out.println(X);

        int roll_Number = 20;
        // if we will give space then it will give error

//        int 1x; // give error

//        int x1; // not give any error

        //you can not declare variable name as a keyword
        // like if else switch class new this try catch ............

//        int else ;


        int String = 10;
        System.out.println(String);

        char r = 'A';
        int y = 20;
        int z = -10; // it store in 2 compliment form
        System.out.println(Integer.toBinaryString(z));

        //printing the greek code using for loop
        char i = 0x0372;
        for(char j = 0x0900;j<=0x0970 ; j++){
            System.out.print(j+" ");
        }
        System.out.print(i);

    }


}
