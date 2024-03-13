Feature: Type of pets we love


  @petTypes
  Scenario: Type of pets we love
    Then user sees the list of pets below
      | cat    |
      | dog    |
      | parrot |


  Scenario: Officer reads data about driver
    Then Officer is able to see any data he wants
      | name    | jana      |
      | surname | Doe       |
      | age     | 29        |
      | address | somewhere |
      | zipcode | 99999     |