Feature: Add dress, tops and saree to cart
  Background:
    Then User login to app
@Test5
@SmokeTest
  Scenario: TC05 After that scroll to bottom and click on Add to Cart for the last item in the
  results(you have to do this for each item DRESS, TOPS, SAREE separately)

    Given user views the DRESS category and click on it
    When user scrolls to the last item1
    And User clicks on Add to Cart1
    Then Verify the confirmation message that Your product has been added to cart1
    And User clicks on continue button1

    And user views the TOPS category and click on it
    Then user scrolls to the last item2
    And User clicks on Add to Cart2
    Then Verify the confirmation message that Your product has been added to cart2
    And User clicks on continue button2


    And user views the SAREE category and click on it
    Then user scrolls to the last item3
    And User clicks on Add to Cart3
    Then Verify the confirmation message that Your product has been added to cart3
    And User clicks on continue button3
