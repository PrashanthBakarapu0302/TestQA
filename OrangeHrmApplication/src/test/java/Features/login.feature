
@tag
Feature: OrangeHRM Login
  I want to use this template for my feature file

Background:
    Given user is on login page
    When user eneter valid username and password
    And Click on Admin Button on the Dashboard 
    
@Test
  Scenario: Valid login to Orange HRM
    Then user should able to logout from the Application

 
@Test2
  Scenario: Deleting the Job Title & Job Description
    And Click on Job button and Job Titles
    Then user should able to delete the record successfully
    And user should able to logout from the Application
    
    
    
 @Test1
  Scenario: Validating the Organization Tab on Admin Page
    And Click on Organization Tab
    Then user should able to view the General Information
    And user should able to logout from the Application
    
    