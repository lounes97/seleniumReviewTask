Feature: user place order feature


  @task3
  Scenario: verify order option
    Given user open the website on home page
    Then user enter the username "Test"
    And user enter the password "Tester"
    Then user clicks login button
    And user click on order option
    Then user see all the three options
    |MoneyCog|
    |Familybea|
    |Screenable|



