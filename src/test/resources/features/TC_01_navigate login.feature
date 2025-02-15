Feature:Navigate to the login page
  TC01 Verify that the user can navigate to login page

@Test1
@SmokeTest
  Scenario:TC01 Verify that the user can navigate to login page
    When user goes to the login page
    Then verify the login text in the top right corner of the app.