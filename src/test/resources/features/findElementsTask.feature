Feature: Find elements on webPage
  @findElements
  Scenario: Find different elements on webPage
  Given User go to "abTesting" website
  And User locate and print all the links on the webPage
  Then User print the number of links we have on the webPage
  Then User print all the texts of the links






#TC #2: FindElements Task
#1- Open a chrome browser
#2- Go to: https://practice.cydeo.com/abtest
#3- Locate all the links in the page.
#4- Print out the number of the links on the page.
#5- Print out the texts of the links.
#6- Print out the HREF attribute values of the links