@US01 @smoke @regression
Feature: As a user, I should be able to log in to the application with valid credentials

  Scenario Outline: Verify login with valid credentials
    Given the user is on the login page of the app
    When the user inputs username "<username>" and passcode "<password>"
    And the user clicks the login button
    Then verify the user is at the home page

    Examples:
      | username             | password |
      | hr5@cydeo.com        | UserUser |
      | helpdesk5@cydeo.com  | UserUser |
      | marketing5@cydeo.com | UserUser |