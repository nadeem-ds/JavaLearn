package nad;


class Outer{
    int x=10;

    class inner{
        int y=20;
        void innermethod(){
            System.out.println("Inner method"+y+"and x is"+x);
        }
    }

    void outerMethod(){
        int x=30;

        inner in = new inner();
        in.innermethod();


    }
}

public class OuternadInnerclass {
    public static void main(String[] args){

        Outer oc = new Outer();
        oc.outerMethod();
    }
}
