Feature: Form submission on Digital Store

Scenario: User submits the form
    Given The user is on the Digital Store website
    When The user submits the form with valid data
    Then The user should see a confirmation message