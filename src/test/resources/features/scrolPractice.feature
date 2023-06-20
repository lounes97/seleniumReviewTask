@scrollPractice

Feature: Scroll practice
  Scenario: Practice scroll with java script
    Given User go to "scrollWebSite" website
    Then User scroll with javaScript 75000 pixels down 10 times
    Then User scroll with javaScript 75000 pixels up 10 times




#    TC #6: Scroll using JavascriptExecutor
#  1- Open a chrome browser
#  2- Go to: https://practice.cydeo.com/infinite_scroll
#  3- Use below JavaScript method and scroll
#  a. 750 pixels down 10 times.
#  b. 750 pixels up 10 times
#  JavaScript method to use : window.scrollBy(0,0)