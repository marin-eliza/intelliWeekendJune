Feature: To validate the dropdown values

  @StaticDropdown
  Scenario: Handle Static Dropdown
    Given user launch the browser and navigate to the url
    When user select value from the currency dropdown
    And user iterates the dropdown values

  @DynamicDropdown
  Scenario: handle Dynamic Dropdown
    Given user launch the browser and navigate to the url
    When user selects the dynamic dropdown
    And Click