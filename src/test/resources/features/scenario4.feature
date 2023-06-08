Feature: Choosing method of payment
  @task4
  Scenario: user open the website
    Given user open the website on home page
    Then user enter the username "Test"
    And user enter the password "Tester"
    Then user clicks login button
    Then user clicks on ORDER
    And user can see the radio button to choose the card type
    |Visa|
    |MasterCard|
    |American Express|

