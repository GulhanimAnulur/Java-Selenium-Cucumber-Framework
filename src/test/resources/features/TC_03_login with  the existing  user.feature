Feature:Login with the existing user
  TC03Login to new user that is created in the previous step


   @Test3
   @SmokeTest
  Scenario: TC03 Login to new user that is created in the previous step
    When User navigates to the Login Sign Up page
    Then User clicks on login button
    And User enters the new user's credentials
    Then Verify that you are redirected to the user dashboard and see the message: "Logged in as Username

