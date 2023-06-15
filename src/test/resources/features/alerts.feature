@Alerts
Feature: Alert practice
  Background:  Website setup
    Given User go to "JSAlertsURL" website
  @alert
  Scenario: JS Alerts
  Then user click to JS Alert button
  And user click on Ok button
  Then user verify that Successfully clicked an alert text is displayed
@alert2
    Scenario: JS Confirm button
  Then user click JS Confirm button
    And user click on Ok button
  Then user verify that “You clicked: Ok” text is displayed.
  @alert3
  Scenario: JS prompt button
  Then user click JS prompt button
  And user send "hello" text alert

  Then user verify that You entered: "hello" text is displayed



#TC #3: Information alert practice
#1. Open browser
#2. Go to website: http://practice.cydeo.com/javascript_alerts
#3. Click to “Click for JS Prompt” button
#4. Send “hello” text to alert
#5. Click to OK button from the alert
#6. Verify “You entered: hello” text is displayed.








#  TC #2: Confirmation alert practice
#  1. Open browser
#  2. Go to website: http://practice.cydeo.com/javascript_alerts
#  3. Click to “Click for JS Confirm” button
#  4. Click to OK button from the alert
#  5. Verify “You clicked: Ok” text is displayed.

#TC #1: Information alert practice
#1. Open browser
#2. Go to website: http://practice.cydeo.com/javascript_alerts
#3. Click to “Click for JS Alert” button
#4. Click to OK button from the alert
#5. Verify “You successfully clicked an alert” text is displayed.