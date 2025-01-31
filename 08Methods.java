package nad;

public class Methods {

    static int Max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }

    public static void main(String args[]){

        //creating the method
//        Methods obj = new Methods();
        //creating the method
        int x=40,y=20;
        int res = Max(x,y);
        System.out.println("the bigger is "+res);
    }
}
2
