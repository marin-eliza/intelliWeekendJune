package javabasics;

public class StringExample {

    public static void main(String[] args) {

        String a = "Aravinth";
        System.out.println(a.substring(1,5));
        String c ="aravinth";
        System.out.println(c.replace('a','i'));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.charAt(1));
        System.out.println(a.length());
        String b ="                a n           ";

        System.out.println(a.concat(b));

        System.out.println(b.trim());



    }
}
