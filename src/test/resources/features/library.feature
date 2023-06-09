Feature: Library Verification
  @library
    Scenario: incorrect credentials verification
    Given user on chrome browser
    When user go to the library web page
    And user gives "incorrect@email.com"
    And user put incorrect credential "incorrect password"
    When user sign in
    Then user see "Sorry, Wrong Email or Password"










#  PS: Locate username input box using “className” locator
#  Locate password input box using “id” locator
#  Locate Sign in button using “tagName” locator