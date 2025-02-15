Feature: Delete Account
  Background:
    Then User login to app

@Test8
  @SmokeTest
  Scenario: TC08 user deletes the account by clicking delete account on top
    When user clicks on delete account button
    Then User Verifies the message account is deleted

