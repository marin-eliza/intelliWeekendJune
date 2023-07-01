package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePage;
import reusable.BrowserCall;

import java.time.Duration;
import java.util.Set;

public class NewSteps extends BrowserCall {

    @Given("user enter the value in from dropdown")
    public void selectValue(){

        getDriver().findElement(By.name("flying_from_N")).click();
        WebElement fromElement = getDriver().findElement(By.name("flying_from"));
        fromElement.sendKeys("che");

        int i =0;
        while(i<4){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
            wait.pollingEvery(Duration.ofSeconds(10));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("flying_from")));
            fromElement.sendKeys(Keys.ARROW_DOWN);
            i++;
        }


        fromElement.sendKeys(Keys.ENTER);

    }

    @Given("user hovers and select the baby wish list")
    public void clickBabyList() {
        HomePage.hoverSignIn();
        HomePage.clickBabyList();
    }

    @When("user performs Drag and drop")
    public void userPerformsDragAndDrop() {

        WebElement drag = getDriver().findElement(By.id("draggable"));
        WebElement drop = getDriver().findElement(By.id("droppable"));
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(drag,drop).build().perform();

        getDriver().switchTo().defaultContent();

        getDriver().switchTo().alert().accept();


    }

    @Given("switch to frame")
    public void switchToFrame() {

        WebElement frameEle = getDriver().findElement(By.className("demo-frame"));

        getDriver().switchTo().frame(frameEle);
    }

    @Given("Open the get to know us in multiple tabs")
    public void openTheGetToKnowUsInMultipleTabs() {

      WebElement getToKnow =  getDriver().findElement(By.cssSelector(".navFooterLinkCol.navAccessibility"));

      for (int i = 0 ; i < getToKnow.findElements(By.tagName("a")).size();i++)  {
          String keyAction = Keys.chord(Keys.CONTROL,Keys.ENTER);
          getToKnow.findElements(By.tagName("a")).get(i).sendKeys(keyAction);
      }

    }

    @When("switch to the window")
    public void switchToTheWindow() {

      Set<String> winValues =  getDriver().getWindowHandles();

      for(String h:winValues){

         if(getDriver().switchTo().window(h).getTitle().equals("Press centre | Amazon India")){

             break;
         }
      }

      getDriver().switchTo().defaultContent();



    }
}
