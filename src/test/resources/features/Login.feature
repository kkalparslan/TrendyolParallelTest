Feature: Trendyol Login Process


  @wip
  Scenario: Valid Login
    Given User should be on the Trendyol website
    When The user should click on the Login button
    And The user should enter valid mail and password
    And The user should be click on the Login button
    Then The user should be logged in successfully