package nad;


class HondaCity{
    static long price =10;
    int a,b;

    static public double onroadprice(String city) {
//        System.out.println("accesing the non static method"+a+b); //i will get error
        switch (city) {
            case "delhi":
                return price * price * 0.1;

            case "mumbai":
                return price * price * 0.09;

            default:
                System.out.println("nothing");

        }

        return 0;
    }
}

public class staticmethod {

    static {
        System.out.println("Static block 1");
    }


    public static void main(String[] args){
        System.out.println("static method");

//        HondaCity hc1 = new HondaCity();
//        HondaCity hc2 = new HondaCity();
//
//
//        System.out.println(hc1.price);
//        System.out.println(hc2.price);
//
//
//        System.out.println(HondaCity.price);
//
//
//        System.out.println(hc1.onroadprice("mumbai"));


    }

    static {
        System.out.println("Staic block 2");
    }
}
