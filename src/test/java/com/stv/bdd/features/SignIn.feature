Feature: sign in

  Scenario: 01 open the main project page
    Given Main page is loaded
    When  Click on account link
    Then Account page is loaded

  Scenario Outline: 02 Input email address and password
    When  the User inputs email "<email>"
    And  the User inputs password "<password>"
    And the User clicks Sign in securely button
    Examples:
      | email |
      | 123@gmail.ru |
      Examples:
      | password |
      | 123 |
