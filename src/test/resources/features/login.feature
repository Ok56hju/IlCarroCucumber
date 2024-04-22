Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And  User enters valid data
    And User click on Yalla button
    Then User verifies Success Massage is displayed
    And User quites browser