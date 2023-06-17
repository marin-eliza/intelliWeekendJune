package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

public class SigninPage extends BrowserCall {

    //###########Loctoros###########
   private static By emailIdLocotor = By.id("ap_email");
   private static By continueButtonLocotor = By.id("continue");

    //###########Methods###########
    public static void enterEmail(){

        getDriver().findElement(emailIdLocotor).sendKeys(prob.getProperty("email"));

    }

    public static void clickContinueButton(){

        getDriver().findElement(continueButtonLocotor).click();
    }

    public static void enterPassword(){

        getDriver().findElement(By.id("ap_password")).sendKeys(prob.getProperty("password"));
    }

    public static void clickSignIn(){

        getDriver().findElement(By.id("signInSubmit")).click();
    }

    public static String getErrorMessage(){

      return getDriver().findElement(By.xpath("//div[@class='a-alert-content']")).getText();
    }

}
