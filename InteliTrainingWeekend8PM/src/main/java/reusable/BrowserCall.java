package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserCall {

    public static Properties prob;
    private static ThreadLocal<WebDriver> th = new ThreadLocal<>();
    public static WebDriver browserInvo() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/utility/confi.properties"));
        prob= new Properties();
        prob.load(fis);

//        if(prob.getProperty("browser").equalsIgnoreCase("edge")){
//            driver = new EdgeDriver();
//        }
//        else if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
//            driver = new ChromeDriver();
//        }
//        else{
//            throw new InvalidArgumentException("Provide valid Input");
//        }

        switch (prob.getProperty("browser").toLowerCase()){

            case "edge":
                th.set(new EdgeDriver());
                break;
            case "chrome":
                th.set(new ChromeDriver());
                break;
            case "safari":
                th.set(new SafariDriver());
                break;
            default:
                throw new InvalidArgumentException("{rovide valid Browser Input");
        }

        getDriver().navigate().to(prob.getProperty("url"));
        getDriver().navigate().refresh();
//        getDriver().navigate().back();
//        getDriver().navigate().forward();
      //  getDriver().get(prob.getProperty("url"));
        getDriver().manage().window().maximize();

        return getDriver();

    }

    public static WebDriver getDriver(){

       return th.get();
    }
}
