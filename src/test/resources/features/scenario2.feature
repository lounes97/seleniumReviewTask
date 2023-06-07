Feature: SUccesful login with valid credentials
  @task2
  Scenario: user open the website
    Given user open the website on home page
    Then user enter the username "Test"
    And user enter the password "Tester"
    Then user clicks login button
    Then user verify if the URL ends with "orders"


