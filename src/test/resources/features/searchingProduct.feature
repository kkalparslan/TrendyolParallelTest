Feature: Searching Product Test

  Background:
    Given User should be on the Trendyol.com website
    When The user should click on the first Login button
    And The user should enter valid mail and password
    And The user should be click on the second Login button

    @turgut
  Scenario: TC_01 searching product
    And User should hover top modul
    And User should click "Köpek Maması" under the Petshop
    And User should scroll down the page a little.
