package stepdefinationfile;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.InvalidArgumentException;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import pageobjects.SigninPage;
import reusable.BrowserCall;
import reusable.ReadExcel;

import java.io.IOException;

public class AmazonSteps {

    private String userSearchData = null;

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
    public void userSearchTheSpecificProductInSearchTab() throws IOException {

        HomePage.enterSearchKeyword(ReadExcel.fetchValue("ProductList",0,0));
        
        HomePage.clickSearchButton();


    }

    @Then("results should display for the search result")
    public void resultsShouldDisplayForTheSearchResult() {

        switch (userSearchData) {
            case "Electric Cooker" -> Assert.assertEquals("Amazon.com : Electric Cooker", SearchResultPage.getTitle());
            case "iPhone" -> Assert.assertEquals("Amazon.com : iPhone", SearchResultPage.getTitle());
            default -> throw new InvalidArgumentException("Pass valid keyword");
        }

    }


    @Given("user search the specific product {string} in search tab")
    public void userSearchTheSpecificProductInSearchTab(String searchValue) {

        userSearchData = searchValue;
        HomePage.enterSearchKeyword(searchValue);
        HomePage.clickSearchButton();
    }

    @Then("results should display for the search result {string}")
    public void resultsShouldDisplayForTheSearchResult(String expectedResult) {

        Assert.assertEquals(expectedResult,SearchResultPage.getTitle());
    }
}
