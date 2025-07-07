package nad;

public class Recursion {

    public static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void main(String args[]){
        System.out.println("This is recursion class");
        fun(3);
    }
}
