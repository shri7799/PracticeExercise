# In BDD, the test data will be put in the feature file
# Username : demouser1@gmail1.com
# Password : 12345
# If you have a small test data to be passed to the feature step, then use:
# Examples keyword
# '<EmailId>' is a placeholder, it is like an object or variable which will store the test data for the step
Feature: Enter login Credentials on tutorialsNinja Page

  Scenario Outline: Test username and password for login page
    Given I am on tutorialsNinja HomePage
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click login button

    Examples: 
      | EmailId              | password |
      | demouser1@gmail1.com |    12345 |
