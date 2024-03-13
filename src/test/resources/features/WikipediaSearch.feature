@wip
Feature: Wikipedia Search functionality

  Agile story:
  As a user, when I am on the Wikipedia search page
  I should be able to search anything and see relevant results

  Background:
    Given User is on Wikipedia Home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button

  Scenario: Wikipedia title verification
    Then  User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Header Verification
    Then User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Image Header Verification
    Then User sees "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia search functionality with scenario outline
    Given User is on Wikipedia Home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then  User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedHeader>" is in the main header
    Then User sees "<expectedHeader>" is in the image header

    Examples: search values we gonna be use in this scenario
      | searchValue   | expectedTitle | expectedHeader | expectedHeader |
      | Steve Jobs    | Steve Jobs    | Steve Jobs     | Steve Jobs     |
      | Marry Barra   | Marry Barra   | Marry Barra    | Marry Barra    |
      | Sundar Pichai | Sundar Pichai | Sundar Pichai  | Sundar Pichai  |
      | Marie Curie   | Marie Curie   | Marie Curie    | Marie Curie    |