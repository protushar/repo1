Feature: LoginFeature
  This feature deals with login functionality of apps.

  Scenario: Login with correct user id and password
    Given I navigate to login page of application
    And I entered username and password
    And i click login button
    Then i should see home page