package javabasics;

import io.cucumber.java.be.I;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String > m = new HashMap<Integer,String>();
        m.put(5677,"Aravinth");
        m.put(677,"xyz");

        System.out.println(m);
        System.out.println( m.get(5677));

        System.out.println(m.values());



    }
}
