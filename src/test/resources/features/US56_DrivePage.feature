
Feature: As a user,I want to access Drive Page


  Scenario: Verify Drive Page
    Given the user logged in with username as "hr1@cydeo.com" and password as "UserUser"
    When user click on the Drive Tab
    And user should click all document
    Then user should be on all document page



