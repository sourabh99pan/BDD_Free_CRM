Feature: Free CRM application testing

@RegressionTest @SmokeTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@Remote
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test

@Remote
Scenario: Create a deal
Given This is a deal test case

