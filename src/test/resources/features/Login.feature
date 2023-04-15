Feature: Trendyol Login Process

  #Description:
  #This test case is used to verify the successful login process on the Trendyol.com website with a VALID
  #username and password combination.
  #Steps:
  #Access the Trendyol.com website.
  #Click on the "Login" button on the homepage.
  #Enter a valid username and password combination in the respective fields.
  #Click on the "Login" button.
  #Verify that the user is successfully logged in.
  #Check for the presence of user-specific information, such as username or profile picture, indicating a successful login.
  #Navigate to the user's account page and verify that the user's account information is displayed correctly.


  Scenario: TC_01 Valid Login
    Given User should be on the Trendyol.com website
    When The user should click on the Login button
    And The user should enter valid mail and password
    And The user should be click on the Login button
    Then The user should be logged in successfully


    #Description:
    #This test case is used to test the login process on Trendyol.com website with an INVALID username and password combination.
    #Steps:
    #Access Trendyol.com website.
    #Click on the "Login" button on the homepage.
    #Enter an invalid username and password combination in the respective fields.
    #Click on the "Login" button.
    #Check for the display of an error message.
    #Verify that the error message accurately indicates an invalid username and password combination.
    #Retry with different invalid username and password combinations.
    #Verify that error messages are displayed correctly and invalid login attempts are rejected.

  @wip
  Scenario: TC_02 Invalid Login
    Given User should be on the Trendyol.com website
    When The user should click on the Login button
    And The user should enter an invalid mail and password
    And The user should be click on the Login button
    Then The user should see an error message indicating invalid login attempt
