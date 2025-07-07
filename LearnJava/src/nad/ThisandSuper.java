package nad;


class Rectangle1{
    int length;
    int breath;
    int x ;

    Rectangle1(int i,int b){
        this.length=i;
        this.breath=b;
    }


}
class Cuboid extends Rectangle1 {
    int height ;
    int x = 20;

    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class ThisandSuper {
    public static void main(String[] args){
        System.out.println("This is this and super class");
        Cuboid c = new Cuboid(10,5,15);
        c.display();
    }


}
