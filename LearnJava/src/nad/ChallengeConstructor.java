package nad;


class CyclinerChallenge{
    private int length;
    private int height;

    public CyclinerChallenge(){
        length=height=1;
    }
//    public CyclinerChallenge(int l){
//        length=height=l;
//    }
    public CyclinerChallenge(int l,int h){
        length = l;
        height = h;
    }
    public int getLength(){
        return length;
    }

    public int getHeight(){
        return  height;
    }
   public void setLength(int l){
       length =  l;
    }
    public  void setHeight(int h){
        height=h;
    }
    public void setDimension(int l,int h){
        length=l;
        height=h;
    }

    public double area(){
        return Math.PI*length*length;
    }

    public  double perimeter(){
        return 2*Math.PI*height;
    }


    public double drumArea(){
        return 2*area()*perimeter()*height;
    }

    public double volume(){
        return 2*area()*height;
    }

}

class Product {
    private  String itemno;
    private String name;
    private double price ;
    private int quantity;


    public Product(String itemno){
        this.itemno=itemno;
    }
    public Product(String name, String itemno){
        this.name=name;
        this.itemno=itemno;
    }

    public Product(String name, String itemno,double price,int quantity){
        this.itemno=itemno;
       this.name=name;
       setPrice(price);
       setQuantity(quantity);
    }
    public String getItemNo(){return  itemno;}
    public String getName(){return name;}

    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setItemno(String s){
        itemno=s;
    }
    public void setName(String n){
        name=n;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setQuantity(int sq){
        quantity=sq;
    }

    //properties

}



class Customer{
    private String custId;
    private String name;
    private String add;
    private String phn;

    public Customer(){
        this.custId = custId;
        this.name = name;
    }

    public Customer(  String custId, String name, String add, String phn){
        this.custId = custId;
        this.name= name;
        setAdd(add);
        setPhn(phn);
    }

    public String getCustId(String custId){
        return custId;
    }
    public String getName(String name){
        return name;
    }
    public String getAdd(String name){
        return add;
    }
    public String getPhn(String name){
        return phn;
    }

    public void setPhn(String phn){
        this.phn = phn;
    }

    public void setAdd(String add){
        this.add=add;
    }

}

public class ChallengeConstructor {
    public static void main(String args[]){
        System.out.println("Challenge student constructor");

//        CyclinerChallenge c2 = new CyclinerChallenge();
//        c2.setHeight(10);
//        c2.setLength(20);
//        c2.setDimension(10,20);
//
//        System.out.println("The area is "+c2.area());
//        System.out.println("Perimeter is "+c2.perimeter());
//        System.out.println("Drum area is "+c2.drumArea());
//        System.out.println("The volume is "+c2.volume());


    Customer C1 = new Customer();
    C1.setAdd("IBM india pvt limited");
    C1.setPhn("8748876823784");
    
    System.out.println("");

    }
}
