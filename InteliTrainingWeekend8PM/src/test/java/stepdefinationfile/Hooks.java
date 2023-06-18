package stepdefinationfile;


import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BrowserCall;

import java.io.IOException;

public class Hooks extends BrowserCall {

    @Before(order = 1)
    public void setup() throws IOException {

        //before start of every scenario
        System.out.println(".....Browser started......");
        BrowserCall.browserInvo();

    }

    @Before(order= 0,value ="@TSID001")
    public void specifcCondition(){

        System.out.println("...conditional hook...");
    }

    @After()
    public void tearDown(){

        //after executing all the test steps in the scenario
            getDriver().close();
    }

    @BeforeStep()
    public void m1(){

        System.out.println("Before step");
    }

    @AfterStep()
    public void takeScreenshot(Scenario sc){
     byte [] b=   ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);

     sc.attach(b,"image/png",sc.getName());
    }
}
