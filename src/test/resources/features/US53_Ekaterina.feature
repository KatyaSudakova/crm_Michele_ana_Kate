
Feature: As a user, I should be able to see all the options under the MORE tab on the homepage.


  @ekaterina
    Scenario: Verify the users view all options under the MORE tab

      Given the user logged in with username as "hr1@cydeo.com" and password as "UserUser"
      Then user should to click to MORE tab
      Then verify the user view all options under the MORE tab
        | File         |
        | Appreciation |
        | Announcement |
        | Workflow     |

