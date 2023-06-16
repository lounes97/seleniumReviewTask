Feature: window handles practice
@Window
  Scenario: Verify windows handles feature
    Given User go to "window" website
    Then verify title is "Windows"
    And user click on Click Here
    And user switch to new window
    Then user verify title is "New Window"


  #TC #5: Window Handle practice
  #Create a new class called: T5_WindowsPractice
  #Create new test and make set ups
  #Go to : https://practice.cydeo.com/windows
  #Assert: Title is “Windows”
  #Click to: “Click Here” link
  #Switch to new Window.
  #Assert: Title is “New Window”