package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> s = new HashSet<String>();
        s.add("Aravinth");
        s.add("Aravinth");
        System.out.println(s);
        s.add("ooo");
        System.out.println(s);
        s.add("hhh");
        System.out.println(s);

        System.out.println(s.contains("iiii"));

        for(String g:s){
            System.out.println(g);
        }
    }
}
