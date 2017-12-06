$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/asos_addItemToBag.feature");
formatter.feature({
  "name": "Use the website to find shirts and add an item to bag",
  "description": "  So that I can buy it\n  As a customer\n  I want to be able to add an item to the bag to buy it",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a t shirt to bag",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to order a shirt",
  "keyword": "Given "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:25"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"purple t shirts\"",
  "keyword": "When "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:29"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a t shirt to bag",
  "keyword": "And "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:44"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see purple t shirt added to the bag",
  "keyword": "Then "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:62"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/asos_australia_search.feature");
formatter.feature({
  "name": "Use the website to find products in the Australian store",
  "description": "          So that I can order a shirt\n          As an Australian customer\n          I want to be able to find t shirts in my store",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for t shirts",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to order a shirt",
  "keyword": "Given "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:25"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"yellow t shirts\" in the Australian store",
  "keyword": "When "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:33"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see some \"yellow t shirts\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:52"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/asos_saveForLater.feature");
formatter.feature({
  "name": "Use the website to find shirts and save an item for later",
  "description": "  So that I can buy it later\n  As a customer\n  I want to be able to save an item to buy later",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Save a t shirt for later",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to order a shirt",
  "keyword": "Given "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:25"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"purple t shirts\"",
  "keyword": "When "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:29"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I save a t shirt for later",
  "keyword": "And "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:38"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see purple t shirt saved for later",
  "keyword": "Then "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:57"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/asos_search.feature");
formatter.feature({
  "name": "Use the website to find shirts",
  "description": "  So that I can order a shirt\n  As a customer\n  I want to be able to find t shirts",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for t shirts",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to order a shirt",
  "keyword": "Given "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:25"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"purple t shirts\"",
  "keyword": "When "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:29"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see some \"purple t shirts\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AsosSearchStepDefs.java:52"
});
formatter.result({
  "status": "passed"
});
});