Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
#
#Given  User is accesing ToolsQA
#When title of page
#Then Enter User details "Sourabh" and "Pandya"


#with example keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is accesing ToolsQA
When  title of page
Then Enter User details "<username>" and "<password>"
Then Close the browser

Examples:

	|username | password|
	|sourabh  | pandya |
	| david   | millar | 
	
