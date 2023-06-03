package javabasics;

public class VariablesExample {

    int b= 45;   // global variable

    public void m1(){

        int a = 1;  //local varibale
        System.out.println(a);
        System.out.println(b);
    }

    public void m2(){

        System.out.println(b);
    }
}
