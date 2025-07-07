package nad;


//understanding with interface
abstract class abstractClass{
    abstract public void showDetails();
    abstract public void hideDetails();
}

class myNormalClass extends abstractClass{
    @Override
    public void showDetails(){
        System.out.println("showing the data of myNormalClass");
    }
    @Override
    public void hideDetails(){
        System.out.println("Hididng the details");
    }
}

//understanding with interface

interface myInterfaceClass{
    void method1();
    void method2();
}

class myclassinterface implements myInterfaceClass{
    public void method1(){
        System.out.println("THis is my normal interface class");
    }
    public void method2(){
        System.out.println("this is my normal second interface class");
    }
}


public class InterfaceExample {
    public static void main(String[] args){
        System.out.println("THis is interface");



        //do the example with abstract class

//        abstractClass newclass = new myNormalClass();
//        newclass.showDetails();
//        newclass.hideDetails();


        myInterfaceClass mynewinterface = new myclassinterface();
        mynewinterface.method1();
        mynewinterface.method2();

    }
}
