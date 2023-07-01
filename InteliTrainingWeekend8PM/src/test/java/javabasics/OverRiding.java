package javabasics;

public class OverRiding extends OverRide2 {

    public static void main(String[] args) {

        OverRide2 o = new OverRide2();
        o.m1();

    }

    public void m1(){
        System.out.println("1");
    }
}
