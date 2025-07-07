package nad;

public class Methods {

    static int Max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }

    static void update(int A[]){
        A[0]= 24;

        System.out.println("updated value is "+A[0]);
    }

    static String getName(String email){
        int a = email.indexOf('@');
        String name = email.substring(0,a);
        return name;
    }

    static  boolean isPrime(int a){
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    static int GCD(int m,int n){

//        int result = (m > n) ? (m - n) : (n - m);

        if (m > n) {
            m = m - n;
        } else {
            n = n - m;
        }
        return m;
    }

    static int findMax(int A[]){

        int temp = A[0];
        for(int i=1;i<A.length-1;i++){
            if(A[i]>temp){
                temp=A[i];
            }
        }
        return temp;

    }


    //method overloading
    //you can give same name of function but different data types , input parameter types that is called method overloading
    //like
    // int max (int a,int b)
    // float max(float a, float b)
    // int max (int a ,int b , int c)


    static  int max (int x,int y){
        return x>y?x:y;
    }

    static float max(float x,float y){
        return x>y?x:y;
    }

    static int totalSum(int ...item){
        if(item.length==0) return Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<item.length;i++){
            sum = sum+item[i];
        }
        return sum;

    }



    public static void main(String args[]){

        //creating the method
//        Methods obj = new Methods();
        //creating the method
//        int x=40,y=20;
//        int res = Max(x,y);
//        System.out.println("the bigger is "+res);

//        int A[] = {1,2,3,4,5,6};
//        update(A);
//        System.out.println("Normal value is "+A[0]);

        //Learn how object are passed

//        String email = "nadeem@gmail.com";
//        String name = getName(email);
//        System.out.println("Your name is "+name);


        //check number is prime or not
//        int d=12;

//        System.out.println("Given no is prime "+isPrime(d));

//        int m = 15;
//        int n = 25;
//
//       int res = GCD( m, n);
//        System.out.println("GDC of number is " +res);



        //find max of array

//        int A[] ={1,4,677,77,8432,444};
//
//        int res = findMax(A);
//
//        System.out.println("The max element is "+res);



        //sum of all the number

       int total =  totalSum(10,20,30,40,50,60);
        System.out.println("the total sum is "+total);

        System.out.println(max(2,4));

    }
}

