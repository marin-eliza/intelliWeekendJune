package automationbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {


    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("LearnMore");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.id("Login")).click();
      String actualResult =  driver.findElement(By.id("error")).getText();
      String ExpectedResult = "Check your username and password. If you still can't log in, contact your Salesforce administrator.";
      if(actualResult.equals(ExpectedResult)){

          System.out.println("equal");
      }
      else {

          System.out.println("not equal");
      }

    }

}
