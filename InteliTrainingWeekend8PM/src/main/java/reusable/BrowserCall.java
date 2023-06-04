package reusable;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserCall {

   static WebDriver driver; // null

    public static WebDriver browserInvo() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/utility/confi.properties"));
        Properties prob = new Properties();
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
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new InvalidArgumentException("{rovide valid Browser Input");
        }

        driver.get(prob.getProperty("url"));
        driver.manage().window().maximize();
        return driver;

    }
}
