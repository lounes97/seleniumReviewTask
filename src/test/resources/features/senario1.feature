Feature: user go to etsy page and verify title matching
@task1
  Scenario: etsy title verification
    Given user go to Etsy home page
    Then title and url should be the same as expected
    When user types "wooden spoon" in search box
    And user clicks search button
    Then user sees "Wooden spoon" in the title



