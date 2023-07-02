package stepdefinationfile;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BrowserCall;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public class SalesforceloginValidationSteps extends BrowserCall{

      WebDriver driver ; //null
      WebElement currenyElement;
    public SalesforceloginValidationSteps(){

    }


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
   public void launchURL() throws IOException {

    driver =  BrowserCall.browserInvo();



    try{
        driver.findElement(By.id("aravinth")).sendKeys("123");
    }
    catch(ElementNotInteractableException e){



    }



   }

   @When("user enters the username {string} and password {string}")
   public void enterUserNamePassword(String username , String password){

       WebElement enterUN = getDriver().findElement(By.id("username"));
       WebElement enterPW =  getDriver().findElement(By.id("password"));
       enterUN.sendKeys(username);
    //  driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys(username);
       enterPW.sendKeys(password);

     // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]"));
    //  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

       getDriver().navigate().refresh();
       try {
           enterUN.sendKeys("aravinth");
           enterPW.sendKeys("123");
       }
       catch (StaleElementReferenceException e){
            enterUN = getDriver().findElement(By.id("username"));
            enterPW =  getDriver().findElement(By.id("password"));
           enterUN.sendKeys("aravinth");
           enterPW.sendKeys("123");
       }




   }




   @Then("user should naviagte to the homepage")
   public void validateHomePage() {

      driver.findElement(By.xpath("//input[@id='username']/parent::div")).click();

   }


   @When("user select value from the currency dropdown")
   public void userSelectValueFromTheCurrencyDropdown() {

      currenyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
      Select selectCurrency = new Select(currenyElement);

     // selectCurrency.selectByIndex(2);
      // selectCurrency.selectByVisibleText("KWD");
      selectCurrency.selectByValue("CAD");

      driver.findElement(By.className("paxinfo")).click();
      //specific wait time
       WebDriverWait specifcWait = new WebDriverWait(driver, Duration.ofSeconds(60));
      WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
      Select selectAdult = new Select(adultElement);
      selectAdult.selectByIndex(5);

   }

   public  void waitExample(){

       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
       wait.pollingEvery(Duration.ofSeconds(10));
       wait.ignoring(NoSuchElementException.class);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")));
       driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")).click();

       WebElement e = driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday"));
       wait.until(ExpectedConditions.textToBePresentInElement(e,"Next Day"));
       driver.findElement(By.linkText("Next Day")).click();
   }

   public void m1(){

    driver.switchTo().alert().dismiss();
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

   @When("user selects the dynamic dropdown")
   public void handleDynamicDrop() {

      driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
      driver.findElement(By.xpath("//a[@value='BLR']")).click();
  //    driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='CJB']")).click();

      WebElement form = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
      form.findElement(By.xpath("//a[@value='CJB']")).click();

     driver.findElement(By.cssSelector("[id='username']")).click();
     driver.findElement(By.cssSelector("#username"));
     driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username"));
   }

    @Given("user books the <{string}> ticket")
    public void userBooksTheTicket(String bookingType) {

       if(bookingType.equalsIgnoreCase("one way")){

       }
       else if(bookingType.equalsIgnoreCase("two way")){

       }
    }

    @When("Iterate the value from Table")
    public void iterateTheValueFromTable() {

      WebElement eyTable = driver.findElement(By.cssSelector(".infobox.vcard"));

        List<WebElement> column1=  eyTable.findElements(By.tagName("tr"));
        List<String> col1Value = new ArrayList<String>();
        for(WebElement e:column1){
            col1Value.add( e.getText());
        }

        System.out.println(col1Value);

        for(String i:col1Value){
            System.out.println(i);
        }

//     int rowSize = eyTable.findElements(By.tagName("tr")).size();
//        System.out.println(rowSize);
//
//        for(int i=0 ; i < eyTable.findElements(By.tagName("th")).size() ;i++){
//
//           String colunm1value = eyTable.findElements(By.tagName("th")).get(i).getText();
//            System.out.println(colunm1value);
//        }

        List<String> col2Value = new ArrayList<String>();

        for(int i=1 ; i < eyTable.findElements(By.tagName("td")).size()  ;i++){

            col2Value.add(eyTable.findElements(By.tagName("td")).get(i).getText());
        }

        System.out.println(col2Value);

        Map<List , List> m = new HashMap<List,List>();
        m.put(col1Value,col2Value);

        Assert.assertEquals(m.get("Type"),"Public");


    }

    @And("Iterate the value from Table two")
    public void iterateTheValueFromTableTwo() {

     WebElement revenueTable =  driver.findElement(By.cssSelector(".wikitable"));

     int fy19Size =revenueTable.findElements(By.xpath("//td[4]")).size();

     for (int k=0 ; k < fy19Size ;k++){
         System.out.println(  revenueTable.findElements(By.xpath("//td[4]")).get(k).getText());
     }
    }
}
