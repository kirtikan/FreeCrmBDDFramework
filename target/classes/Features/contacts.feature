
Feature: Free CRM Create Contact Feature

Scenario Outline: Free CRM Create a new Contact Scenario

Given user is already on login page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact deatils "<firstname>" and "<lastname>" and "<department>"
Then close the browser

Examples: 
  | username              | password     | firstname  |  lastname  |  department  |
  | kirti.16dec@gmail.com | kirti@292008 | Kirti      |  Kanojiya  |   QA         |
	| kirti.16dec@gmail.com | kirti@292008 | Tom        |  Morse     |   Dev        |
