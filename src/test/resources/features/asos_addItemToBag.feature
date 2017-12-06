Feature: Use the website to find shirts and add an item to bag
  So that I can buy it
  As a customer
  I want to be able to add an item to the bag to buy it

  Scenario: Add a t shirt to bag
    Given I want to order a shirt
    When I search for "purple t shirts"
    And I add a t shirt to bag
    Then I should see purple t shirt added to the bag