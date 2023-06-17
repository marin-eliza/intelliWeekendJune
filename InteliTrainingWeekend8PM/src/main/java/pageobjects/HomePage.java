package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

public class HomePage extends BrowserCall {


    public static void clickSignIn(){

        getDriver().findElement(By.id("nav-link-accountList-nav-line-1")).click();
    }

    public static void enterSearchKeyword(String searchKeyword){

        getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(searchKeyword);
    }

    public static void clickSearchButton(){

        getDriver().findElement(By.id("nav-search-submit-button")).click();
    }

}
