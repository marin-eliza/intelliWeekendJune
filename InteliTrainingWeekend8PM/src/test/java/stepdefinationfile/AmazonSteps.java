package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.HomePage;
import pageobjects.SigninPage;
import reusable.BrowserCall;

import java.io.IOException;

public class AmazonSteps {

    @Given("user enters the credit in signIn page")
    public void userSignIn() throws IOException {

        BrowserCall.browserInvo();
        HomePage.naviageToSignInPage();
        SigninPage.enterEmail();
        SigninPage.clickContinueButton();
        SigninPage.enterPassword();
        SigninPage.clickSignIn();
    }

    @Then("user validates whether it navigates to home page")
    public void validateSignIn() {

    }
}
