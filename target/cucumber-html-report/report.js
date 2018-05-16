$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "login fuctinality",
  "description": "",
  "id": "login-fuctinality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19977653370,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "homepage fuctionality",
  "description": "",
  "id": "login-fuctinality;homepage-fuctionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "i me on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i click on home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i should navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_Test.iMeOnHomePage()"
});
formatter.result({
  "duration": 304615173,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_Test.iClickOnHomePage()"
});
formatter.result({
  "duration": 4848392910,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_Test.iShouldNavigateToHomePage()"
});
formatter.result({
  "duration": 14944966,
  "status": "passed"
});
formatter.after({
  "duration": 3843633635,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "register new user",
  "description": "",
  "id": "login-fuctinality;register-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on registerlink",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should navigate to Registerpage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I select tital",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter firstname as \"\u003cFname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter lastname as \"\u003cLname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter email as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter confirm password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I accept terms and codition",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on submit botton",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should successfully creat account",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login-fuctinality;register-new-user;",
  "rows": [
    {
      "cells": [
        "Fname",
        "Lname",
        "email",
        "password"
      ],
      "line": 23,
      "id": "login-fuctinality;register-new-user;;1"
    },
    {
      "cells": [
        "vishal",
        "ghinaiya",
        "vishal_ghinaiya@hotmail.com",
        "somnath09"
      ],
      "line": 24,
      "id": "login-fuctinality;register-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13164554740,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "register new user",
  "description": "",
  "id": "login-fuctinality;register-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on registerlink",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should navigate to Registerpage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I select tital",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter firstname as \"vishal\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter lastname as \"ghinaiya\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter email as \"vishal_ghinaiya@hotmail.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter password as \"somnath09\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter confirm password as \"somnath09\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I accept terms and codition",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on submit botton",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should successfully creat account",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterPageTest.iAmOnLoginpage()"
});
formatter.result({
  "duration": 9770165594,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTest.iClickOnRegisterlink()"
});
formatter.result({
  "duration": 389733534,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTest.iShouldNavigateToRegisterpage()"
});
formatter.result({
  "duration": 2154331074,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTest.iSelectTital()"
});
formatter.result({
  "duration": 3354848775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vishal",
      "offset": 22
    }
  ],
  "location": "RegisterPageTest.iEnterFirstnameAs(String)"
});
formatter.result({
  "duration": 1552784644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ghinaiya",
      "offset": 21
    }
  ],
  "location": "RegisterPageTest.iEnterLastnameAs(String)"
});
formatter.result({
  "duration": 319036177,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vishal_ghinaiya@hotmail.com",
      "offset": 18
    }
  ],
  "location": "RegisterPageTest.iEnterEmailAs(String)"
});
formatter.result({
  "duration": 670857676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "somnath09",
      "offset": 21
    }
  ],
  "location": "RegisterPageTest.iEnterPasswordAs(String)"
});
formatter.result({
  "duration": 337256802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "somnath09",
      "offset": 29
    }
  ],
  "location": "RegisterPageTest.iEnterConfirmPasswordAs(String)"
});
formatter.result({
  "duration": 337353794,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTest.iAcceptTermsAndCodition()"
});
formatter.result({
  "duration": 400305140,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTest.iClickOnSubmitBotton()"
});
formatter.result({
  "duration": 6568320798,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTest.iShouldSuccessfullyCreatAccount()"
});
formatter.result({
  "duration": 216320711,
  "status": "passed"
});
formatter.after({
  "duration": 5085566884,
  "status": "passed"
});
});