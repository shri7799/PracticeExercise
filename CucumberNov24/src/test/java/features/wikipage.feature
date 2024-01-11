@all
Feature: Test Wiki page on browser

  @functional
  Scenario: Test Create account on Wiki page
    Given User is on Main Page
    Then User Enters username
    And User enters password

  @functional @login
  Scenario: Test Login link on Wiki Page
    Given User is on Main Page
    When User clicks on Login link
    Then User clicks on checkbox on login page
    Then user clicks on Forgot your password? link