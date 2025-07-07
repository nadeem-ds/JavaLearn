package nad;

public class Loop {
    public static void main(String args[]){
        System.out.println("Loops");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        //factorial of num
        int fact=1;
        for (int j=10;j>=1;j--){
            fact = fact * j;

        }
        System.out.println("Mul"+fact);
    }
}
