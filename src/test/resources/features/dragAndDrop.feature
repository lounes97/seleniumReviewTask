Feature: Drag and drop practice
  @dragAndDrop
  Scenario: Drag and drop default value verification
  Given User go to "dragAndDrop" website
  And user verify that text in big circle changed to "Drag the small circle here."
  When user drag and drop small circle into big one expected text should be "You did great!"
  Then user click and hold the circle and the expected text should be "Drop here."
  And user move and drop outside of the circle and the expected text should be "Try again!"
  Then user drag the small circle on top of the big circle, hold it, and verify that text changed to "Now drop..."






#TC2 #: Drag and drop default value verification
#1. Go to https://practice.cydeo.com/drag_and_drop_circles
#2. Verify big circle default text is as below.
#3. Assert:
#-Text in big circle changed to: “Drag the small circle here.”
#  TC3 #: Drag and drop into the big circle
#  1. Go to https://practice.cydeo.com/drag_and_drop_circles
#  2. Drag and drop the small circle to bigger circle.
#  3. Assert:
#  -Text in big circle changed to: “You did great!”
#  TC4 #: Click and hold
#  1. Go to https://practice.cydeo.com/drag_and_drop_circles
#  2. Click and hold the small circle.
#  3. Assert:
#  -Text in big circle changed to: “Drop here.”
#  TC5 #: Drag and drop outside of the big circle
#  1. Go to https://practice.cydeo.com/drag_and_drop_circles
#  2. Drag and drop the small circle to bigger circle.
#  3. Assert:
#  -Text in big circle changed to: “Try again!”
#  TC6 #: Drag and hover
#  1. Go to https://practice.cydeo.com/drag_and_drop_circles
#  2. Drag the small circle on top of the big circle, hold it, and verify.
#  3. Assert:
#  -Text in big circle changed to: “Now drop…”