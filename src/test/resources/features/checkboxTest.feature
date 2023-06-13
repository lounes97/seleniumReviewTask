Feature: Testing checkbox
  @checkbox
  Scenario: user verify confirm checkbox
  Given User go to "checkboxesLink" website
  But user confirm checkbox 1 is NOT selected by default
  And user confirm checkbox 2 is SELECTED by default
  Then user click to select checkbox 1
  And user click checkbox 2 to deselect it
  When user confirm checkbox 1 is selected
  And user confirm checkbox 2 is not selected








#TC#3: Checkboxes
#1. Go to https://practice.cydeo.com/checkboxes
#2. Confirm checkbox #1 is NOT selected by default
#3. Confirm checkbox #2 is SELECTED by default.
#4. Click checkbox #1 to select it.
#5. Click checkbox #2 to deselect it.
#6. Confirm checkbox #1 is SELECTED.
#7. Confirm checkbox #2 is NOT selected.