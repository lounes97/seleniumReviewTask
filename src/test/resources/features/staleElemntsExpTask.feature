Feature: Stale elements exception task
  @staleEl
  Scenario: user verify stale elements exception
  Given User go to "ABPracticeURL" website
  And verify CYDEO link is displayed
  Then refresh the page
  And verify CYDEO link is displayed


  #TC #4: StaleElementReferenceException Task
  #1- Open a chrome browser
  #2- Go to: https://practice.cydeo.com/abtest
  #3- Locate “CYDEO” link, verify it is displayed.
  #4- Refresh the page.
  #5- Verify it is displayed, again.
  #This is a simple StaleElementReferenceException to understand what is
  #this exception and how to handle it.