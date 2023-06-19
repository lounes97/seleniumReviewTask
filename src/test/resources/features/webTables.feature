Feature: web table practice
  @wt
    Scenario: verify with the expected order
  Given User go to "webTablesUrl" website
  Then verify that Bob’s name is listed as "Bob Martin"
  And verify that Bob Martin’s order date is as "12/31/2021"





#TC #1: Web table practice
#1. Go to: https://practice.cydeo.com/web-tables
#2. Verify Bob’s name is listed as expected.
#Expected: “Bob Martin”
#3. Verify Bob Martin’s order date is as expected
#Expected: 12/31/2021