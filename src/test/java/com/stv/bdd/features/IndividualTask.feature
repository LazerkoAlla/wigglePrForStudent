Feature: individual task

  Scenario: 03 Selection of a product
    Given Main page is loaded
    When the User clicks on all brands link
    Then all brands page is visible
    When the User clicks on the first brand
    Then first brand page is visible
    When the User clicks on the last product
    And the User selects a color
    And the User selects a size
    And the User clicks on add to Basket button
    And the User clicks on continue Shopping button


