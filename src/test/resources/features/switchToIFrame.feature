Feature: Double click practice
  @dClick
  Scenario: Switching to iframe
  Given User go to "doubleClick" website
  When user switch to iframe
  And double click on the text
  Then user verify that text’s "style" attribute value contains "red".




#TC #1: Double Click Test
#1. Go to
#https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
#ck2
#2. Switch to iframe.
#3. Double click on the text “Double-click me to change my text color.”
#4. Assert: Text’s “style” attribute value contains “red”.