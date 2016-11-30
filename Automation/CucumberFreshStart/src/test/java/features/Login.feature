Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for login
      | userName | password      |
      | admin    | adminpassword |

    And I click login button
    Then I should see the userform page

  Scenario Outline: Login with correct username and password
    Given I navigate to the login page
    And I enter <userName> and <password>
    And I click login button
    Then I should see the userform page
    Examples:
      | userName | password   |
      | execute  | automation |
      | admin    | admin      |
      | testing  | qa         |

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the users email address as Email:admin
    And I verify the count of my salary digitsfor UAH 15000

    And I enter the following for login
      | userName | password      |
      | admin    | adminpassword |

    And I click login button
    Then I should see the userform page

