package nad;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static  void main(String args[]){
        System.out.println("Arrays");

        //creating a array


//        int A[] = new int[5];
//        int B[] = {1,2,3,4,5};
//
//        int c[];
//        c = new int[10];

//        System.out.println(B);
//
//        for (int i=0;i<A.length;i++){
//            System.out.println("Array value is "+ A[i]);
//        }
//
//        //second way to get the data from aray
//
//        for (int x : B){
//            System.out.println("Second way is "+x);
//        }



        //Assignment
        //Q1 finding sum of all the element
//        int sum = 0;
//        for (int i=0;i<B.length;i++){
//            sum = sum + B[i];
//        }
//        System.out.println("Sum is "+sum);

        //Q2 searching the element
//        Scanner s = new Scanner(System.in);
//        int search = s.nextInt();
//        for (int i=0;i<B.length;i++){
//            if(search==B[i]){
//                System.out.println("Value matched ");
//                System.exit(0);
//            }
//        }
//        System.out.println("Not found");

        //Q3 finding maximum element
//        int max = B[0];
//        for (int i=0;i<B.length;i++){
//
//            if(B[i]>max){
//                max = B[i];
//            }
//        }
//        System.out.println("The max value is " + max);


        //Q4 finding second largest element


//        int max1=B[0],max2 = B[0];
//        for (int i=0;i<B.length;i++){
//
//            if(B[i] > max1){
//                max2 = max1;
//                max1 = B[i];
//            }else if (B[i]>max2){
//                max2 = B[i];
//            }
//        }
//        System.out.println("The max value is " + max2);


        //Q5 Rotate the array

//        int temp = B[0];
//
//        for(int i = 1 ; i<B.length; i++){
//            B[i-1] = B[i];
//        }
//        B[B.length-1] = temp;
//
//        for (int x : B){
//            System.out.println(x);
//        }


        // 2D array

//        int C[][] = new int[5][5];
//
//        int D[][] = {{12,3,4},{2,3,4,5},{4,5,6}};
//
//        //printing the data inside the 2d array
//
//        for(int i=0;i<D.length;i++){
//            for(int j=0;j<D[0].length;j++){
//                System.out.println("the data is "+D[i][j]);
//            }
//        }


        //adding 2 matrics

//        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
//        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
//        int C[][] = new int[3][3];
//
//        for (int i=0;i<A.length;i++){
//            for(int j=0;j<B.length;j++){
//                C[i][j] = A[i][j]+B[i][j];
//            }
//        }
//
//        for (int i = 0;i<C.length;i++){
//            for(int j=0;j<C[0].length;j++){
//                System.out.println(C[i][j]);
//            }
//        }

        //Multiplying the 2 metrics
//        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
//        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
//        int C[][] = new int[3][3];
//
//    for(int i=0;i<A.length;i++){
//        for (int j=0;j<B.length;j++){
//            C[i][j]=0;
//
//            for (int k=0;k<3;k++){
//                C[i][j] = C[i][j] + A[i][k]*B[k][i];
//            }
//        }
//    }
//
//    for(int x[] : C){
//        for(int y : x){
//            System.out.println("The new multiply matrix is "+y);
//        }
//    }

        //Sorting the array
        String str[] = {"java","python","pyhsial","ruby","aandela"};

        java.util.Arrays.sort(str);

        for (String i : str){
            System.out.println("The sorted string is "+i);
        }

    }
}
