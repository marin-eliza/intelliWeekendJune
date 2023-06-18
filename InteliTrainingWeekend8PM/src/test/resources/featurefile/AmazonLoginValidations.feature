Feature: user validates the signin and signout functionality

  @TSID001
  Scenario: user validates the sign in functionality with incorrect password
    Given user enters the credit in signIn page
    Then user validates the error message

  @TSID002
  Scenario: Validate the search functionality
    Given user search the specific product in search tab
    Then results should display for the search result

  @TSID003
  Scenario Outline: Validate the search functionality
    Given user search the specific product "<Product>" in search tab
    Then results should display for the search result "<ExpectedResult>"
    Examples:
      | Product         | ExpectedResult               |
      | Electric Cooker | Amazon.com : Electric Cooker |
      | iPhone          | Amazon.com : iPhone          |

  @TSID004
  Scenario Outline: Validate the search functionality
    Given user search the specific product "<Product>" in search tab
    Then results should display for the search result
    Examples:
      | Product         | ExpectedResult               |
      | Electric Cooker | Amazon.com : Electric Cooker |
      | iPhone          | Amazon.com : iPhone          |
