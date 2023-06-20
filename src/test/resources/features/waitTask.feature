Feature: Wait tasks
@wtsk
  Scenario: verify explicit waits
    Given User go to "waitTaskUrl" website
    And user clicks on Remove button and waits until loading bar disappears
    Then user verify checkbox is not displayed and "It's gone!" message is displayed

    #TC #2: Explicit wait practice
    #1- Open a chrome browser
    #2- Go to: https://practice.cydeo.com/dynamic_controls
    #3- Click to “Remove” button
    #4- Wait until “loading bar disappears”
    #5- Verify:
    #a. Checkbox is not displayed
    #b. “It’s gone!” message is displayed.
    #NOTE: FOLLOW POM