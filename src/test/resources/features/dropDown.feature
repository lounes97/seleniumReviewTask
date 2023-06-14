Feature: dropDown functionality


  Background: website setup
    Given User go to "dropDown" website

  Scenario: Verify drop down functionality

    And verify default selected for simpleDropdown value is "Please select an option"
    And verify default selected for stateDropdown value is "Select a State"


    #TC#5: Verifying “Simple dropdown” and “State selection” dropdown
    #default values
    #1. Open Chrome browser
    #2. Go to https://practice.cydeo.com/dropdown
    #3. Verify “Simple dropdown” default selected value is correct
    #Expected: “Please select an option”
    #4. Verify “State selection” default selected value is correct
    #Expected: “Select a State”
  @dropDown
  Scenario: verify user select convenient date

    And user select "December" 1 st, 1933 and verify it is selected


  #TC #6: Selecting date on dropdown and verifying
  #1. Open Chrome browser
  #2. Go to https://practice.cydeo.com/dropdown
  #3. Select “December 1st, 1933” and verify it is selected.
  #Select year using : visible text
  #Select month using : value attribute
  #Select day using : index number