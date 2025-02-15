Feature: Proceed to Checkout
  Background:
    Then User login to app
@Test7
@SmokeTest
  Scenario: TC07 user verifies that they have successfully completed the checkout and payment
    Given User clicks on cart icon
    When user clicks on checkout button
    And User scrolls to bottom and click on place order button
    Then user enters the payment details and clicks on pay and confirm order
    Then User verifies order successful message that Congratulations! Your order has been confirmed!
