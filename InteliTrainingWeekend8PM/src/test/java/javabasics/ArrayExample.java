package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int []b = new int[2];
        b[0] = 34;
        b[1] = 67;
        int d[] ={34,67};


        int [] a = {45,23,89,90};  //0,1,2,3 // length - 4

        for(int j:a){
            System.out.println(j);
        }

        String [] o = {"Aravinth","AN"};

        for(String output:o){
            System.out.println(output);
        }

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
