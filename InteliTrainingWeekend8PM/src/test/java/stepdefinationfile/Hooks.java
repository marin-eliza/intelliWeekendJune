package stepdefinationfile;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before()
    public void setup(){

        System.out.println("Browser Invokes");
    }

    @After()
    public void tearDown(){

        System.out.println("End");
    }
}
