@digitec
Feature: Digitec search functionality
  Agile story : User should be able to type any keyword and see relevant information


  Scenario: Digitec title verification

  Given User is on digitec homepage
  Then User sees title is as expected.

  #expectedTitle: digitec.ch – the online shop for all things digital

  Scenario: Digitec Search functionality
    Given User is on digitec homepage
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title
