package javabasics;

public class PolyExample {

    public static void main(String[] args) {

        PolyExample p = new PolyExample();
        p.m1(7);

    }

    public void m1(int a){

        System.out.println(a);
    }

    public void m1(String a){

        System.out.println(a);
    }

    public void m1(int a , int b){

        System.out.println(a + b);
    }

    public void m1(String a , int b){

        System.out.println(b);
    }

}
