package nad;

//class Super {
//    public void display() {
//        System.out.println("Hello");
//    }
//}
//
//class Sub extends Super {
//    public void display() {
//        System.out.println("Hello Nadeem");
//    }
//}

//class TV {
//    public void swithOn() {
//        System.out.println("Switch on ");
//    }
//
//    public void changeChannel() {
//        System.out.println("Change the channel");
//    }
//}


//class SmartTV extends TV {
//
//    @Override
//    public void swithOn() {
//        System.out.println("Smart Tv switch on");
//    }
//
//    @Override
//    public void changeChannel() {
//        System.out.println("Smart Tv Change Channel ");
//    }
//
//    public void changeLanguage() {
//        System.out.println("Change the language of tv");
//    }
//
//}

class Car {
    public void start() {
        System.out.println("Start on ");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }
    public void changeGear() {
        System.out.println("change Gear");
    }

}

class SmartCar extends Car {

    @Override
    public void changeGear() {
        System.out.println("Change Gear of smart car");
    }


    public void openRoof() {
        System.out.println("Open roof for smart Car ");
    }



}




public class MethodOveridding {
    public static void main(String[] args) {
//        System.out.println("main class ");

//        Super s = new Super();
//        s.display();
//
//        Sub s1 = new Sub();
//        s1.display();
//
////        what if i will create a reference of super but object of Sub
//
//        Super s2 = new Sub();
//        s2.display();

//        TV t1 = new TV();
//        t1.changeChannel();
//        t1.swithOn();
//
//        SmartTV t2 = new SmartTV();
//        t2.changeChannel();
//        t2.swithOn();
//        t2.changeLanguage();

        Car c1 = new Car();
        c1.accelerate();
        c1.changeGear();
        c1.start();

        SmartCar sc = new SmartCar();
        sc.changeGear();
        sc.openRoof();
        sc.accelerate();
        sc.start();

    }


}
