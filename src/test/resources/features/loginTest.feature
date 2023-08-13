Feature: Trendyol Login Test

  #Description:
  #This test case is used to verify the successful login process on the Trendyol.com website with a VALID
  #username and password combination.
  #Steps:
  #Open the Trendyol.com website.
  #Click on the "Login" button on the homepage.
  #Enter a valid username and password combination in the respective fields.
  #Click on the "Login" button.
  #Verify that the user is successfully logged in.
  #Check for the presence of user-specific information, such as username or profile picture, indicating a successful login.
  #Navigate to the user's account page and verify that the user's account information is displayed correctly.


  @wip
  Scenario: TC_01 Valid Login
    Given User should be on the Trendyol.com website
    When The user should click on the first Login button
    And The user should enter valid mail and password
    And The user should be click on the second Login button
    Then Verify that the user should be logged in successfully

