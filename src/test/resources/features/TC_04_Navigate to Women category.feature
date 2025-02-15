Feature: Navigate to Women category
  Background:
    Then User login to app.
@Test4
@SmokeTest
  Scenario: TC04 Click on Women under Category and click on each item DRESS, TOPS, SAREE
    When user clicks on the women text under the category
    Then User verifies that the options for dress, tops and saree are displayed