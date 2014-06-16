$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account.feature");
formatter.feature({
  "id": "login-function-check",
  "description": "",
  "name": "login function check",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login-function-check;user-log-in-with-correct-username-and-correct-password",
  "description": "",
  "name": "user log in with correct username and correct password",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "dhis log in page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "user log in",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "user should see dashboard page",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "LogInSteps.openBrowser()"
});
formatter.result({
  "duration": 5081510895,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.logInWithCorrectUsernameAndPassword()"
});
formatter.result({
  "duration": 3348130227,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.assertDashboardPage()"
});
formatter.result({
  "duration": 5898793759,
  "status": "passed"
});
});