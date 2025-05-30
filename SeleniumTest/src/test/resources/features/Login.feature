Feature: Login functionality of OrangeHrm
 

  @tag1
  Scenario: Successful login with valid credentials
  
    Given User launches the browser
    When user open the OrangeHRM login page
    And Enter username "<USERNAME>" and "<PASSWORD>" 
    And click on LoginButton
    
    Examples:
    |USERNAME |PASSWORD|
    |Admin| admin123|
    