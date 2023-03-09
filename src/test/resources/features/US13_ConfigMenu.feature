@smoke @regression
Feature: As a user, I should be able to configure the menu.
  @B28G37-72 @wip
  Scenario: Verify users can access to 6 options under the CONFIGURE MENU with hr login credentials.
    Given the user is logged in with username as "hr5@cydeo.com" and password as "UserUser"
    Given users are on the homepage
    When users click the CONFIGURE MENU option
    Then verify the users see below options in menu
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
  @B28G37-73 @wip
  Scenario: Verify users can access to 6 options under the CONFIGURE MENU with helpDesk login credentials.
    Given the user logged in with username as "helpdesk1@cydeo.com" and password as "UserUser"
    Given users are on the homepage
    When users click the CONFIGURE MENU option
    Then verify the users see below options in menu
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
  @B28G37-74 @wip
  Scenario: Verify users can access to 6 options under the CONFIGURE MENU with marketing login credentials.
    Given the user logged in with username as "marketing1@cydeo.com" and password as "UserUser"
    Given users are on the homepage
    When users click the CONFIGURE MENU option
    Then verify the users see below options in menu
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |

