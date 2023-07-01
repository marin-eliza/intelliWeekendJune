package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    public static void hoverSignIn(){
        WebElement signIn = getDriver().findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(getDriver());
        a.clickAndHold(signIn).build().perform();
    }

    public static void clickBabyList(){
        getDriver().findElement(By.linkText("Baby Wishlist")).click();
    }

}
