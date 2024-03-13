Feature: Cydeo Web tables login


  Scenario: user should be able to Login with true credentials
    Given user is on the login page of Cydeo WebTables
    When user enters "Test" as username
    And user enters "Tester" as a password
    Then user should be able to verify URL as ending with "orders"


  Scenario: User should be able to login with true credentials
    Given user is on the login page of Cydeo WebTables
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    Then user should be able to verify URL as ending with "orders"


  Scenario: User should be able to see the options under product dropdown

    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Payment options verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees Visa as enabled payment option
    Then user sees Mastercard as enabled payment option
    Then user sees American Express as enabled payment option



      #TASK 9 : CREATE PARAMETERIZED VERSION OF THE SCENARIO

  Scenario: New order placement verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "2"
    And user clicks to calculate button
    And user enters customer name "Jane Doe"
    And user enters street "7th street"
    And user enters city "New york"
    And user enter state "New york"
    And user enters zip "99999"
    And user selects payment option "American Express"
    And user enters credit card number "1111222233334444"
    And user enters expiration date "12/27"
    And user clicks to "Process Order" button
    Then user should see "Jane Doe" in the first row of the web table


  @WT_Wip
  #TASK 10 : CREATE SCENARIO OUTLINE VERSION
  Scenario Outline: New order placement verification

    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "<quantity>"
    And user clicks to calculate button
    And user enters customer name "<name>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enter state "<state>"
    And user enters zip "<zip>"
    And user selects payment option "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expDate>"
    And user clicks to "Process Order" button
    Then user should see "<name>" in the first row of the web table
    Examples:
      | quantity | name       | street     | city   | state | zip   | cardType         | cardNumber       | expDate | name       |
      | 3        | Berat KAYA | 7th avenue | NY     | NY    | 99999 | Visa             | 1111222233334444 | 09/29   | Berat KAYA |
      | 2        | Veli KAYA  | 5th avenue | Dayton | OH    | 99999 | American Express | 2111222233334444 | 01/29   | Veli KAYA  |


