
@tag1
Feature: OrangeHRM Login
  I want to use this template for my feature file
   
@Test8
  Scenario Outline: validating the login functionality with valid and invalid data
    Given user is on login page
    When user enter valid "<username>" and "<password>"
    And Click on Admin Button on the Dashboard 
    Then user should able to logout from the Application

 Examples:
 |username  | password  |
 |Admin     |admin123   | 
