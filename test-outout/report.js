$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kirti/eclipse-workspace1/FreeCrmBDDFramework/src/main/java/Features/amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon search feature",
  "description": "",
  "id": "amazon-search-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Amazon verifying searching scenario",
  "description": "Given: user is already on home page\r\nAnd: user clicks on sign-in button\r\nAnd: user enters \"kirti.16dec@gmail.com\" and \"kirti@292008\"\r\nWhen: user search for \"Mobile Phones\"\r\nAnd: user select brand \"Samsung\"\r\nThen: verify last displayed item from result",
  "id": "amazon-search-feature;amazon-verifying-searching-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
});