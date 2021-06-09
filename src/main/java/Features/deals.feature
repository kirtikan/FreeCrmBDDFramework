
Feature: Free CRM Create Deals Feature

Scenario: Free CRM Create a new Deal Scenario

Given user is already on login page
When title of login page is Cogmento CRM
Then user enters username and password
 | kirti.16dec@gmail.com | kirti@292008 |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deals deatils title and commission and amount
 | FreeCRMTest | 5 | 4 |
Then close the browser
