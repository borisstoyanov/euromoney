$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 1,
  "name": "Sucuri Signup page",
  "description": "As a customer,\nI want to open the signup page \nso that I can select a plan and signup",
  "id": "sucuri-signup-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5706790464,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Pricing changes when I change number of websites",
  "description": "",
  "id": "sucuri-signup-page;pricing-changes-when-i-change-number-of-websites",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I\u0027m on the SignupPage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select 3 websites",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "basic should be: \"50.07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "pro should be: \"74.97\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "business: \"124.98\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageTests.im_on_the_signuppage()"
});
formatter.result({
  "duration": 1964880185,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTests.i_select_3_websites()"
});
formatter.result({
  "duration": 1858614965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50.07",
      "offset": 18
    }
  ],
  "location": "HomePageTests.basic_should_besomething(String)"
});
formatter.result({
  "duration": 34574129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "74.97",
      "offset": 16
    }
  ],
  "location": "HomePageTests.pro_should_be_something(String)"
});
formatter.result({
  "duration": 37891442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "124.98",
      "offset": 11
    }
  ],
  "location": "HomePageTests.business_something(String)"
});
formatter.result({
  "duration": 36743618,
  "status": "passed"
});
formatter.after({
  "duration": 480575092,
  "status": "passed"
});
formatter.before({
  "duration": 5068359237,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Select a plan and signup",
  "description": "",
  "id": "sucuri-signup-page;select-a-plan-and-signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I\u0027m on the SignupPage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I buy SucuriAntivirusSolution",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should be at the CreateAccountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter email:\"randomemail2@email.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I enter password:\"SOMEsecret1\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I agree with terms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click CreateAccount",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I shoud be on the checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTests.im_on_the_signuppage()"
});
formatter.result({
  "duration": 1958524815,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTests.i_buy_SucuriAntivirusSolution()"
});
formatter.result({
  "duration": 1991400302,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTests.i_should_be_at_the_createaccountpage()"
});
formatter.result({
  "duration": 61727604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "randomemail2@email.com",
      "offset": 15
    }
  ],
  "location": "HomePageTests.i_enter_emailsomething(String)"
});
formatter.result({
  "duration": 220751234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SOMEsecret1",
      "offset": 18
    }
  ],
  "location": "HomePageTests.i_enter_passwordsomething(String)"
});
formatter.result({
  "duration": 1907519358,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTests.i_agree_with_terms()"
});
formatter.result({
  "duration": 132861460,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTests.i_click_createaccount()"
});
formatter.result({
  "duration": 3140839349,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTests.i_shoud_be_on_the_checkout_page()"
});
formatter.result({
  "duration": 38611612,
  "status": "passed"
});
formatter.after({
  "duration": 376543939,
  "status": "passed"
});
});