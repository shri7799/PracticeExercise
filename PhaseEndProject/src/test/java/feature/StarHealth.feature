Feature: Phase End project

  Scenario: Star health home page test
    Given User open the chrome browser and starhealth application
    When User waits for the Welcome to Star Health pop-up and closes it
    Then validates the Star Health home page title using a JUnit assertion
    Then clicks on the Buy Now button
    And User enters following details
      | URL   | FullName  | PhNo       | PIN    | OptionPlan |
      | admin | admin@123 | 9980924169 | 560058 | plan1      |
      | maya  | admin@123 | 9980924169 | 560058 | plan2      |
    Then User clicks on I need health insurance from the drop-down menu and select plan
    Then Validate the user mobile number
    And User clicks on the Star Health logo
    Then Close all the browsers
