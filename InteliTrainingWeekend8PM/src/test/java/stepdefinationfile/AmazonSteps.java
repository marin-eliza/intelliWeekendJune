package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import pageobjects.SigninPage;
import reusable.BrowserCall;

import java.io.IOException;

public class AmazonSteps {

    @Given("user enters the credit in signIn page")
    public void userSignIn() throws IOException {

        HomePage.clickSignIn();
        SigninPage.enterEmail();
        SigninPage.clickContinueButton();
        SigninPage.enterPassword();
        SigninPage.clickSignIn();
    }


    @Then("user validates the error message")
    public void userValidatesTheErrorMessage() {

       String actutalError = SigninPage.getErrorMessage();
       String expectedError = "Your password is incorrect";

       Assert.assertEquals(expectedError,actutalError);

    }

    @Given("user search the specific product in search tab")
    public void userSearchTheSpecificProductInSearchTab() {

        HomePage.enterSearchKeyword("Electric Cooker");
        
        HomePage.clickSearchButton();


    }

    @Then("results should display for the search result")
    public void resultsShouldDisplayForTheSearchResult() {

        String expectedResult = "Amazon.com : Electric";

        Assert.assertEquals(expectedResult ,SearchResultPage.getTitle());


    }
}
