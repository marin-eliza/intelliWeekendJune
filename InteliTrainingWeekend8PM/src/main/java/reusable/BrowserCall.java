package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCall {

   static WebDriver driver; // null

    public static WebDriver browserInvo(){

        driver = new EdgeDriver();
        driver.get("https://book.spicejet.com/");
        driver.manage().window().maximize();
        return driver;

    }
}
