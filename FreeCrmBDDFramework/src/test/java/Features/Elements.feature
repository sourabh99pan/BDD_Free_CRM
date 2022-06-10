Feature: Test Elements module

Scenario: 001_Element_Check full name

Given Elem_Check FullName textBox
When Elem_Check Email textBox
Then Elem_Check CurrentAdd textBox
Then Elem_Check PermAdd textBox

Scenario: 002_Element_TextBox Enter Details

Given Enter all details and click on submit
|  name |     Mail              | current address   | permanent address | 
|Sourabh Pandya|Sourabh.Pandya@gmail.com|patlipada|ratlam|
Then Elem_Displayed

Scenario Outline: 003_Element TextBox_Scenario_Outline

Given Enter all text box details
Then  Enter Details "<name>" and "<Mail>" and "<current address>" and "<permanent address>"


Examples:
|  name |     Mail              | current address   | permanent address | 
|Sourabh Pandya|S.ourabhPandya@gmail.com|patlipada|ratlam|
|David Watt|S.ourabhPandya@gmail.com|Sydney|Perth|

Scenario: 004_Element_RadioButton

Given  Check Yes RadioButton
Then Check RadioButton Message

Scenario: 005_Element_WebTable

Given  Check Rows on WebTable

Scenario: 006_Element_Buttons

Given  Check Click on Buttons

Scenario: 007_Element_UploadFile

Given  Check UploadFile 

Scenario: 008_Dynamic Properities

Given Check EnableButton after 5Sec

Then Check Button Color



