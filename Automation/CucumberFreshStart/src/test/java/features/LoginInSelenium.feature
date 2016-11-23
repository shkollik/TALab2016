Feature: LoginSeleniumFeature
  This feature deals with the login functionality of the application using Selenium

  Scenario Outline: Login with correct username and password by Selenium
    Given I go to the login page
    When I signs in with credentials: <login> and <password>
    And I click button login
    Then I should get to the userform page

    Examples:
      | login | password |
      | admin | admin    |
