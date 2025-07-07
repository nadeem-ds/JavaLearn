package nad;

// i need to create one abstract class and 2 interfce class

//
//abstract class myabsclass{
//    abstract void call();
//    abstract void msg();
//}
//
//interface  Icamera{
//    void click();
//    void record();
//}
//
//interface ImusicPlayer{
//    void play();
//    void stop();
//}
//
//class smartphone extends myabsclass implements Icamera,ImusicPlayer{
//
//    @Override
//    public void click(){
//        System.out.println("Call inside the myiclass");
//    }
//    @Override
//    public void record(){
//        System.out.println("record inside the myiclass");
//    }
//    @Override
//    public void play(){
//        System.out.println("play inside the myiclass");
//    }
//    @Override
//    public void stop(){
//        System.out.println("stop inside the myiclass");
//    }
//
//    @Override
//    public void call(){
//        System.out.println("call");
//    }
//
//    @Override
//    public void msg(){
//        System.out.println("msg");
//    }
//}


import javax.xml.namespace.QName;

interface  member{
    void callback();
}
class store{
    member mem[] = new member[100];
    int count=0 ;

    void register(member m){
        mem[count++]=m;
    }

    void sale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}
class customer implements member {
    String name;
    customer(String n){
        name = n;
    }
    @Override
    public void callback(){
        System.out.println("Ok i will come"+name);
    }
}

public class AbtractClassExample {
    public static void main(String[] args){
//        System.out.println("This is example for interface");

//        smartphone mysphone = new smartphone();
//        mysphone.click();
//        mysphone.record();
//
//        mysphone.play();
//        mysphone.stop();
//        mysphone.call();;
//        mysphone.msg();

        store s =new store();
        customer c1 = new customer("Nadeem");
        customer c2 = new customer("Khalid");
        s.register(c1);
        s.register(c2);

        s.sale();

    }
}
