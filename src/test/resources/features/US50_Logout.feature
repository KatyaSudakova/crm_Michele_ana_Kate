@smoke @regression
Feature: User should be able to log out

  Background: User already logged in and sees the profile page

    Scenario: Verify user can log out successfully
      Given the user logged in with username as "hr1@cydeo.com" and password as "UserUser"
      When the user clicks the profile icon
      Then the user sees the Log out option
      And the user clicks the Log out
      And the user can see the Authorization field
