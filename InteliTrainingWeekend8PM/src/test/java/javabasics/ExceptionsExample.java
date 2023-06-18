package javabasics;

import org.openqa.selenium.TimeoutException;

public class ExceptionsExample {

    public static void main(String[] args) {

        String a = null ;
        try {
             a = "$12345678";
            int c = Integer.parseInt(a);
            double b = 3.14 * c ;
            System.out.println(b);
        }
        catch (NumberFormatException i){

            System.out.println(a.substring(1));
          int c = Integer.parseInt(a.substring(1))  ;
            double b = 3.14* c;
            System.out.println(b);

        }
        catch (TimeoutException p){

        }


    }
}
