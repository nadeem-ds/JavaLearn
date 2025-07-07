package nad;


interface My{
    abstract public void ashow();
}

class outer{

    int x = 10;
    static int y = 20;

    static class sy{
        public void show(){
            System.out.println("THe value of x and y is "+y);
        }
    }
//    public void display(){
//
//        My m = new My() {
//
//            public void ashow() {
//                System.out.println("This is our new method");
//            }
//
//        };
//        m.ashow();
//
////        class inner{
////            public void show(){
////                System.out.println("inner classes");
////            }
////        }
////        inner iclass = new inner();
////        iclass.show();
//    }

}

public class Innerclasses {
    public static void main(String[] args){
        System.out.println("Main class");

        outer.sy o = new outer.sy();
        o.show();
    }
}
