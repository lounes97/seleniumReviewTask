@googleTask
Feature: googlePractice;
  Scenario: google search
    Given user open the google on home page
    Then user types "apple" in google search box
    And user press Enter
    And user verify title contains "apple"
