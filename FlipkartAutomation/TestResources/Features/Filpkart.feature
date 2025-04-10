Feature: Flipkart automation

  @tc001
  Scenario: Test the search functionality
    Given User is on the home page
    Then Enters a product and search
    Then User select minumum and maximum prices
    And User select the brand and Ram
    And User quit browser

  @tc002
  Scenario: Test the search functionality
    Given User is on the furniture Page
    Then Hover on the home furniture section
    Then select the main furniture
    And select the syb furniture
    And User quit browser
