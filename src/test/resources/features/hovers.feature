Feature: Hovers task
@hvr
  Scenario: user hover over elements
    Given User go to "hover" website
  And user hover over first image
  Then user verify "name: user1" is displayed
    And user hover over second image
    Then user verify "name: user2" is displayed
   And user hover over third image
    Then user verify "name: user3" is displayed



    #TC #3: Hover Test
    #1. Go to https://practice.cydeo.com/hovers
    #2. Hover over to first image
    #3. Assert:
    #a. “name: user1” is displayed
    #4. Hover over to second image
    #5. Assert:
    #a. “name: user2” is displayed
    #6. Hover over to third image
    #7. Confirm:
    #a. “name: user3” is displayed