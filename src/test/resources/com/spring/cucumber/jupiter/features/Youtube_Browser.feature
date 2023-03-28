Feature: Browse Youtube Videos

  @UI
  Scenario: Youtube search - Apple
    Given I launch Youtube website
    When I search "Apple" in searchbox
    And I click on Search button
    Then I should see more than 4 results


  @UI
  Scenario: Youtube search - Watermelon
    Given I launch Youtube website
    When I search "Water melon" in searchbox
    And I click on Search button
    Then I should see more than 4 results