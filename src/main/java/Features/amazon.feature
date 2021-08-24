Feature: Amazon search feature

Scenario: Amazon verifying searching scenario
Given: user is already on home page
And: user clicks on sign-in button
And: user enters "kirti.16dec@gmail.com" and "kirti@292008"
When: user search for "Mobile Phones"
And: user select brand "Samsung"
Then: verify last displayed item from result