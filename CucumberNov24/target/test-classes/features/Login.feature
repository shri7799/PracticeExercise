# This is used to write comments
# this is like your test plan
# This is my first feature file
Feature: Testing rediff myPage

  # In the scenario if there are stpes that are common to be executed in the begining
  # as a pre-requisite then we use the keyword Background
  # The below statements demonstrates the use of backgroud keyword
  # these statements will be executed before every scenario in the current feature file **
  Background: 
    Given I open the browser and enter URL
    Then I capture the title of the Page
    When I enter username and password
    Then I click on login button

  # we are using Gherkin keywords
  # each step should have a matching Code
  # for every stpes we have to write code in step definition file
  Scenario: User has to test if login on rediff is successful or not
    And I should see an Error message
    Then I click on Click Here link
    And I close the browser

  Scenario: 
    Then I click on Create a Rediffmail account
    Then I capture the title of the Page
    And I close the browser
