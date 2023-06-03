package javabasics;

public class ArrayExample {

    public static void main(String[] args) {


        int [] a = {45,23,89,90};  //0,1,2,3 // length - 4

        for(int j=0;j<a.length;j++){

            //0< 4
            //1<4
            //4<4 = fails
            System.out.println(a[j]);

        }

        String [] name = {"Aravinth","LearnMore"};
        System.out.println(name[0]);

        for(int i=0 ; i<name.length;i++){
            System.out.println(name[i]);
        }



    }
}
