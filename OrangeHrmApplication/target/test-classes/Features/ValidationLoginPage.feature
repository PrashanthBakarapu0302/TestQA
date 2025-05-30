
@tag1
Feature: OrangeHRM Login
  I want to use this template for my feature file

Background:
Given user is on login page

   
@Test7
  Scenario Outline: validating the login functionality with valid and invalid data
    When user enter valid "<username>" and "<password>"
    And Click on Admin Button on the Dashboard 
    Then user should able to logout from the Application

 Examples:
 |username  | password  |
 |Admin     | admin1234 |
 |admin23   | fsrets    | 
 |Admin     |admin123   | 

 
 @Test7
  Scenario Outline: validating the login functionality with valid and invalid data
   Given user enter valid "<username>" and "<password>"
    And Click on Admin Button on the Dashboard 
    When user should able to logout from the Application

 Examples:
 |username  | password  |
 |Admin454    | admin1234 |
 |admin2334   | fsrets    | 
 |Admin       |admin123   | 
 |admin2334   | fsrets    | 
 
 
  @Test7
  Scenario: validating the login functionality with valid and invalid data
   Given user enter valid "Admin" and "admin123"
    And Click on Admin Button on the Dashboard 
    When user should able to logout from the Application


 