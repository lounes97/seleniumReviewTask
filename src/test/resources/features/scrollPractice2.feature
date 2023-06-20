@ScrollPractice2
Feature: Scroll Practice2
  Scenario:Scroll using JavascriptExecutor
  Given User go to "scrollWebSite2" website
  Then user scroll down to "Cydeo" link
  And user scroll up to "Home" link




  #TC #7: Scroll using JavascriptExecutor
  #1- Open a chrome browser
  #2- Go to: https://practice.cydeo.com/large
  #3- Scroll down to “Cydeo” link
  #4- Scroll up to “Home” link
  #5- Use below provided JS method only
  #JavaScript method to use : arguments[0].scrollIntoView(true)
  #Note: You need to locate the links as web elements and pass them as
  #arguments into executeScript() method