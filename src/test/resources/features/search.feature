Feature: Search

  @searchCar
  Scenario: Find information about renting a car
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User inputs valid data
    And User select date period
    And User click on Yalla button for search

