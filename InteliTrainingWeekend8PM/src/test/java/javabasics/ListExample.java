package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List <Integer> l1 = new ArrayList<Integer>();
        l1.add(45);
        l1.add(67);

        System.out.println(l1);

        l1.add(90);
        System.out.println(l1);

        l1.add(90);
        System.out.println(l1);

        l1.add(1,21);
        System.out.println(l1);

        System.out.println("index" + l1.get(3));

        for(int a :l1){
            System.out.println(a);
        }

        List <String> l2 = new ArrayList<String>(); //empty list
        l2.add("Aravinth");
        for(String u:l2){
            System.out.println(u);
        }

    }
}
