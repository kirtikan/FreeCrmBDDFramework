Feature: Free CRM Login Feature

#without using Examples keyword:
#Scenario: Free CRM Login Test Scenario

#Given user is already on login page
#When title of login page is Cogmento CRM
#Then user enters "kirti.16dec@gmail.com" and "kirti@292008"
#Then user clicks on login button
#Then user is on Home Page

#With using Examples Keyword:

Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | password |
	| kirti.16dec@gmail.com| kirti@292008 |
	| tom@gmail.com | tom@123 |
	
	