Feature: user can be able to log in in opensource dhis2

Scenario: user log in with correct username and correct password

Given dhis log in page
When user log in
Then user should see dashboard page