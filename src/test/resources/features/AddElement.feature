Feature: StaleElementReferenceException handling
  @AddEl
  Scenario: Handling the stale element
  Given User go to "addAndRemoveEl" website
  When user click Add Element button
  Then user verify that Delete button is displayed after clicking
  And user click Delete button
  Then verify that Delete button is NOT displayed after clicking






#TC #1: StaleElementReferenceException handling
#1. Open Chrome browser
#2. Go to https://practice.cydeo.com/add_remove_elements/
#3. Click to “Add Element” button
#4. Verify “Delete” button is displayed after clicking.
#5. Click to “Delete” button.
#6. Verify “Delete” button is NOT displayed after clicking.
#USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS