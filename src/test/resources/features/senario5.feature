Feature: Order placement functionality
  @task5
  Scenario: Verify user can place an order
    Given user open the website on home page
    Then user enter the username "Test"
    And user enter the password "Tester"
    Then user clicks login button
    Then user clicks on ORDER
    And user enter appropriate test data
    And user clicks process order
    Then user should see new order in view all orders table
