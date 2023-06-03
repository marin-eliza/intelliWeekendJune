package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceloginValidationSteps {

      WebDriver driver ; //null
      WebElement currenyElement;

   @Then("validate the error message")
   public void validateErrorMessage() {

      driver.findElement(By.linkText("Forgot Your Password?")).click();
      driver.findElement(By.partialLinkText("t Your Pas"));
      String actualResult =  driver.findElement(By.xpath("//div[@class='loginError']")).getText();
      String ExpectedResult = "Please Check your username and password. If you still can't log in, contact your Salesforce administrator.";
      if(actualResult.equals(ExpectedResult)){

         System.out.println("equal");
      }
      else {

         System.out.println("not equal");
      }

   }

   @And("user clicks on login button")
   public void clickLogin() {

      driver.findElement(By.id("Login")).click();
   }

   @Given("user launch the browser and navigate to the url")
   public void launchURL(){

      driver = new EdgeDriver();
      driver.get("https://book.spicejet.com/");
      driver.manage().window().maximize();
   }

   @When("user enters the username {string} and password {string}")
   public void enterUserNamePassword(String username , String password){

      driver.findElement(By.id("username")).sendKeys(username);
    //  driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys(username);
      driver.findElement(By.id("password")).sendKeys(password);

     // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]"));
    //  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

   }


   @Then("user should naviagte to the homepage")
   public void validateHomePage() {

   }


   @When("user select value from the currency dropdown")
   public void userSelectValueFromTheCurrencyDropdown() {

      currenyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
      Select selectCurrency = new Select(currenyElement);

     // selectCurrency.selectByIndex(2);
      // selectCurrency.selectByVisibleText("KWD");
      selectCurrency.selectByValue("CAD");

      driver.findElement(By.className("paxinfo")).click();
      WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
      Select selectAdult = new Select(adultElement);
      selectAdult.selectByIndex(5);

   }

   @And("user iterates the dropdown values")
   public void userIteratesTheDropdownValues() {

     int currencyValueCount = currenyElement.findElements(By.tagName("option")).size();

      for(int i=0 ;i<currencyValueCount ;i++){

         String value =currenyElement.findElements(By.tagName("option")).get(i).getText();
         //13
         System.out.println(value);
      }

      WebElement cabinElement = driver.findElement(By.id("search-controls-cabin-class-dropdown"));

      for(int i=0 ; i < cabinElement.findElements(By.tagName("option")).size();i++){

         System.out.println( cabinElement.findElements(By.tagName("option")).get(i).getText());
      }

      driver.findElements(By.xpath("//input[@type='radio']")).size();

   }
}
