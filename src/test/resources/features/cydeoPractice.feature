@cydeo1_2
Feature: Cydeo practice
  Scenario: Verify the title
    Given User go to "cydeoPractice" website
    Then User verify the url contains "cydeo"
    And User verify the title is "Practice"
    And User clicks on "A/B Testing"
    Then User verify the title is "No A/B Test"
    And User go back
    Then User verify again the title is "Practice"

