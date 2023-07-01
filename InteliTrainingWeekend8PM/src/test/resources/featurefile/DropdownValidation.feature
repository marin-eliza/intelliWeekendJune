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

  @AutoSuggestive
  Scenario: Handle the Auto suggestive dropdown
    Given user enter the value in from dropdown

  @Mouse
  Scenario: Mouse Actions
    Given user hovers and select the baby wish list

  @DragDrop
  Scenario: Drag and Drop
    Given switch to frame
    When user performs Drag and drop


    @Window
  Scenario: Window Handling
    Given Open the get to know us in multiple tabs
    When switch to the window