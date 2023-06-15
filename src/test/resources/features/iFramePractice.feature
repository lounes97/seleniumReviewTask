Feature: Practice iFrame
  @iFrame
  Scenario: Practice with iFrame
  Given User go to "iFrameWebSite" website
  And User switch to iFrame and check the text "Your content goes here." is displayed
  Then User exit from iFrame and check the text "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed



#1. Create a new class called: T4_Iframes
#2. Create new test and make set ups
#3. Go to: https://practice.cydeo.com/iframe
#4. Assert: “Your content goes here.” Text is displayed.
#5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”