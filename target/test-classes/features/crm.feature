Feature: NextBaseCRM practice
  @crm1
    Scenario: incorrect credentials verification
    Given user go to crm web page
    When user use incorrect username "incorrect"
    And user use incorrect password "incorrect"
    And user clicks the login button
    Then user verify error message "Incorrect login or password"
  @crm2
    Scenario:getText and getAttribute practice
  Given user go to crm web page
  Then user can see the MSG "Remember me on this computer"
  And user can see "Forgot your password?" Btn
 @crm3
  Scenario: NextBaseCRM, locators, getText(), getAttribute() practice
  Given  user go to crm web page
  Then verify login button as "Log In"







#  TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
#  1- Open a chrome browser
#  2- Go to: https://login1.nextbasecrm.com/
#  3- Verify “Log in” button text is as expected:
#  Expected: Log In
#  PS: Inspect and decide which locator you should be using to locate web
#  elements.
#  PS2: Pay attention to where to get the text of this button from


#    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
#    1- Open a chrome browser
#    2- Go to: https://login1.nextbasecrm.com/
#    3- Verify “remember me” label text is as expected:
#    Expected: Remember me on this computer
#    4- Verify “forgot password” link text is as expected:
#    Expected: Forgot your password?
#    5- Verify “forgot password” href attribute’s value contains expected:
#    Expected: forgot_password=yes

