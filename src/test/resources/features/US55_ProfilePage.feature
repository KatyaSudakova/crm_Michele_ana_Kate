@smoke @regression
Feature: Users should be able to access user profile page

  Background:
    Given the user logged in with username as "hr1@cydeo.com" and password as "UserUser"

  @B28G37-93
  Scenario: Verify the user views all options on my profile page
    When the user clicks the user profile
    Then the user sees these options- General Drive Tasks Calendar Conversations