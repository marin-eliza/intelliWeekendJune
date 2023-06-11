package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

public class SigninPage extends BrowserCall {

    //###########Loctoros###########
   private static By emailIdLocotor = By.id("ap_email");
   private static By continueButtonLocotor = By.id("continue");

    //###########Methods###########
    public static void enterEmail(){

        driver.findElement(emailIdLocotor).sendKeys(prob.getProperty("email"));

    }

    public static void clickContinueButton(){

        driver.findElement(continueButtonLocotor).click();
    }

    public static void enterPassword(){

        driver.findElement(By.id("ap_password")).sendKeys(prob.getProperty("password"));
    }

    public static void clickSignIn(){

        driver.findElement(By.id("signInSubmit")).click();
    }

}
