Feature: Trendyol negatif login test
    #Description:
    #This test case is used to test the login process on Trendyol.com website with an
    # INVALID username and password combination.
    #Steps:
    #------
    #Access Trendyol.com website.
    #Click on the "Login" button on the homepage.
    #Enter an invalid username and password combination in the respective fields.
    #Click on the "Login" button.
    #Check for the display of an error message.
    #Verify that the error message accurately indicates an invalid username and password combination.
    #Retry with different invalid username and password combinations.
    #Verify that error messages are displayed correctly and invalid login attempts are rejected.

  @wip
  Scenario Outline: TC_02 Invalid Login
    Given User should be on the Trendyol.com website
    When The user should click on the first Login button
    When The user should input invalid "<email>" and_or "<password>"
    And The user should be click on the second Login button
    Then Verify that the user should be able to see the warning message as "<message>"

    Examples:
      | email               | password | message                                    |
      | alparslan@gmail.com |          | Lütfen şifrenizi giriniz.                  |
      |                     | 123456   | Lütfen geçerli bir e-posta adresi giriniz. |
      | mike@gmail.com      | 123456   | E-posta adresiniz ve/veya şifreniz hatalı. |

