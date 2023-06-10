Feature: To validate whetehr the user can place a succefull order

  Scenario: Sample

    Given user launch the browser and navigate to the url

    Scenario Outline: Booking
      Given user books the <"trip Details"> ticket
      Then Check whether the ticket booked succefully

      Examples:
        | trip Details |
        | one way      |
        | two trip     |