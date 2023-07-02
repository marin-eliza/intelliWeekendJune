package javabasics;

import pageobjects.SampleResuable;

public class ConstructorExampl {

    int a ;
    int b ;

    SampleResuable s;


    public ConstructorExampl(){

        a = 10 ;
        b = 12;
        s = new SampleResuable();

    }

    public static void main(String[] args) {

        ConstructorExampl e = new ConstructorExampl();
        e.addition();
    }


    public void addition(){
        System.out.println(a+b);

        s.m1();
    }


    public void j(){

        s.m2();
    }

}
