Feature: Users should see 5 options under user profile


  Scenario: Verify the user views all options on my profile page

    Given ser logged in with username as "hr1@cydeo.com" and password as "UserUser"
    When user clicks the user profile
    Then the user see  options

  Scenario: Verify the user views all options on my profile page

    Given ser logged in with username as "hr2@cydeo.com" and password as "UserUser"
    When user clicks the user profile
    Then the user see  options

  Scenario: Verify the user views all options on my profile page

    Given ser logged in with username as "hr3@cydeo.com" and password as "UserUser"
    When user clicks the user profile
    Then the user see  options