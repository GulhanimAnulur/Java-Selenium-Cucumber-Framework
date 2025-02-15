Feature: Search for a Product and add to cart
  Background:
    Then User login to app
@Test6
@SmokeTest
  Scenario: TC06 Verify that the items searched and added previously are present, and the total amount is calculated correctly

    Given User clicks on Products on top
    When user types “top” in search box and click on search button
    And In the results, user scrolls to bottom and click on add to cart for the last item
    Then User clicks on view cart button
    Then Verify the items that are added previously are present and the amount total is calculated correctly.
    And User clicks on home button
