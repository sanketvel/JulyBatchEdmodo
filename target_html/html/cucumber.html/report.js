$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Test login",
  "description": "",
  "id": "test-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 245805,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify if user can login using username and password",
  "description": "",
  "id": "test-login;verify-if-user-can-login-using-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test_01"
    },
    {
      "line": 4,
      "name": "@login"
    },
    {
      "line": 4,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "* "
});
formatter.step({
  "line": 7,
  "name": "user logins using username \"teachery1@gmail.com\" and password \"123456\"",
  "keyword": "* "
});
formatter.step({
  "line": 8,
  "name": "verify if user successfully loged-in",
  "keyword": "* "
});
formatter.match({
  "location": "LoginStep.user_is_on_login_page()"
});
formatter.result({
  "duration": 28273550468,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teachery1@gmail.com",
      "offset": 28
    },
    {
      "val": "123456",
      "offset": 63
    }
  ],
  "location": "LoginStep.user_logins_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 830933304,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.verify_if_user_successfully_loged_in()"
});
formatter.result({
  "duration": 12196333690,
  "status": "passed"
});
formatter.after({
  "duration": 932676972,
  "status": "passed"
});
});