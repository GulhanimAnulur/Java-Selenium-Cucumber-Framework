Feature:Sign up Success
  TC02 User should be able to login with correct credential

@Test2
@SmokeTest
  Scenario: Login with correct credential
    When User goes to login page
    And User clicks on login
    Then User enters correct username-email address
    Then User enters account information
    And User clicks create account button
    Then Verify the message is displayed
    And Verify that Congratulations! Your new account has been successfully created! is displayed
    Then  And User closes the page





