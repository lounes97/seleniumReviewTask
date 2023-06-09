Feature: Registration verification
  @regTask
  Scenario: user verify registration feature
  Given user go to cydeo registration webPage
  Then header text should be "Registration form"
  And placeholder attribute value should be "first name"


#  TC #5: getText() and getAttribute() method practice
#  1- Open a chrome browser
#  2- Go to: https://practice.cydeo.com/registration_form
#  3- Verify header text is as expected:
#  Expected: Registration form
#  4- Locate “First name” input box
#  5- Verify placeholder attribute’s value is as expected:
#  Expected: first name