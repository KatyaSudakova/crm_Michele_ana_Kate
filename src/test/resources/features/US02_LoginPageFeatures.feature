@smoke @regression
Feature: As a user, I should be able to access login page features.

  @B28G37-63
  Scenario: Verify login page features
    Given the user is on the login page
    Then verify there is a "Remember me on this computer" message displayed
    Then verify the check box is clickable