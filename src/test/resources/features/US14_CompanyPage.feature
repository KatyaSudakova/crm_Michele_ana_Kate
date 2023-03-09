@US14
Feature: As a user, I should be able to access the Company page

  Scenario: Verify user sees the 7 modules in the Company page
    Given the user is on the homepage
    When the user clicks the Company module
    Then the user can see the following 7 options
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |