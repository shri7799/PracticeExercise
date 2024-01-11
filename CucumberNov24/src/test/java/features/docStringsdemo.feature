#""" (Doc Strings)
## this is used when we have to write 2-3 lines of text in the feature file,
## Instead of writing it in a single line, you can write it in multiple lines using Doc strings
Feature: Email page test

  Scenario: New file for docString demo
    When I reset my password on the email
    Then I should receive an email with the following content
      """
      Hello Malay,
       Please click on this to reset the password
       
       Thanks,
       Admin Team
       
      """