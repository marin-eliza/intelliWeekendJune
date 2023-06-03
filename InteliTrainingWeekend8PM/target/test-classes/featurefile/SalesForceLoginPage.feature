Feature: To validate the login functionality of salesforce application

@TC01  @Regression @Smoke
Scenario: To validate the login with valid username
  Given user launch the browser and navigate to the url
  When user enters the username "hello" and password "123"
  And user clicks on login button
  Then user should naviagte to the homepage

@TC02 @Regression
Scenario: To validate the error message
  Given user launch the browser and navigate to the url
  When user enters the username "learnmore" and password "abc"
  And user clicks on login button
  Then validate the error message

@MultiLogin
Scenario Outline:  To Multiple Logins
  Given user launch the browser and navigate to the url
  When user enters the username "<User Name>" and password "<Password>"
  And user clicks on login button
  Then user should naviagte to the homepage
  Examples:
    | User Name | Password |
    | Us1       | 123      |
    | us2       | abc      |
    | us3       | xyz      |