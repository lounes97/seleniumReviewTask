Feature: NextBaseCRM practice
  @crm
    Scenario: incorrect credentials verification
    Given user go to crm web page
    When user use incorrect username "incorrect"
    And user use incorrect password "incorrect"
    And user clicks the login button
    Then user verify error message "Incorrect login or password"



