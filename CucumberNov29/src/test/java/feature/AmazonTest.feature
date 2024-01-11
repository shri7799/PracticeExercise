Feature: Testing amazon webPage

  Background: 
    Given I open the browser and enter URL
    When I enter Email and Password
    Then I click on Sign in button

  Scenario: User has to test if login on amazon is successful or not
    And I should see an Error message
    And I close the browser

  Scenario: 
    Then I click on Create a amazon account
    And I close the browser
