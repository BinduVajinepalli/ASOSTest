Feature: Use the website to find shirts and save an item for later
  So that I can buy it later
  As a customer
  I want to be able to save an item to buy later

  Scenario: Save a t shirt for later
    Given I want to order a shirt
    When I search for "purple t shirts"
    And I save a t shirt for later
    Then I should see purple t shirt saved for later