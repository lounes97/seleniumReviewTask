Feature: Practice with uploading files
  @upload
  Scenario: uploading test
  Given User go to "uploadUrl" website
  Then user upload the file
  And user verify that the file uploaded is displayed


#TC #2 Upload Test
#1. Go to https://practice.cydeo.com/upload
#2. Find some small file from your computer, and get the path of it.
#3. Upload the file.
#4. Assert:
#-File uploaded text is displayed on the page