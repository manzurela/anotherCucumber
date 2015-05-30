Feature: Facebook smoke test
  Scenario: Login facebook with valid credentials
    Given I am on facebook homepage
    When I enter my valid user name, password
    And  click on login
    Then I enter into facebook successfully
