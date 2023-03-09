Feature: Some of the general functionality verifications

  @Gene
  Scenario Outline: Verify the user can see desktop app options
    Given the user logged in with username as "<userName>" and password as "<password>"
    Then verify the users see desktops options

    Examples:

      | userName       | password |
      | hr7@cydeo.com  | UserUser |
      | hr1@cydeo.com  | UserUser |
      | hr11@cydeo.com | UserUser |