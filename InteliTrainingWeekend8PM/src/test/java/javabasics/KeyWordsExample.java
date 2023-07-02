package javabasics;

public class KeyWordsExample extends ConditionsJava {

    int a = 9 ;
   final double pie = 3.14 ;

    public static void main(String[] args) {
        KeyWordsExample k = new KeyWordsExample();
        k.m1();
    }

    public void m1(){
        int a = 20 ;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

}
