package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

public class HomePage extends BrowserCall {

    public static void naviageToSignInPage(){

        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    }
}
