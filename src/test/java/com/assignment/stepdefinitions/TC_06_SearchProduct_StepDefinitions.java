package com.assignment.stepdefinitions;

import com.assignment.pages.TC_05_AddItemToCart_Page;
import com.assignment.pages.TC_06_SearchProduct_Page;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import com.assignment.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_06_SearchProduct_StepDefinitions {

    WebDriver driver = DriverManager.getDriver();
    TC_06_SearchProduct_Page SearchProductPage=new TC_06_SearchProduct_Page(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Given("User clicks on Products on top")
    public void user_clicks_on_products_on_top() {
        SearchProductPage.ProductButton.click();

    }
    @When("user types “top” in search box and click on search button")
    public void user_types_top_in_search_box_and_click_on_search_button() {
        SearchProductPage.SearchBox.sendKeys(ConfigReader.getProperty("ItemName"));
        SearchProductPage.SearchIcon.click();
        TestUtils.setImplicitWait(driver, 3);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", SearchProductPage.TopLastItem);

    }
    @When("In the results, user scrolls to bottom and click on add to cart for the last item")
    public void in_the_results_user_scrolls_to_bottom_and_click_on_add_to_cart_for_the_last_item() {
    SearchProductPage.TopLastItem.click();
        DriverManager.waitForVisibility(SearchProductPage.VerifyAdded,3);
        Assert.assertEquals(ConfigReader.getProperty("ConfirmationMessage"), SearchProductPage.VerifyAdded.getText());

    }
    @Then("User clicks on view cart button")
    public void user_clicks_on_view_cart_button() {
    SearchProductPage.ViewCartLink.click();
        TestUtils.setImplicitWait(driver, 3);
    }
    @Then("Verify the items that are added previously are present and the amount total is calculated correctly.")
    public void verify_the_items_that_are_added_previously_are_present_and_the_amount_total_is_calculated_correctly() {

    }
    @Then("User clicks on home button")
    public void user_clicks_on_home_button() {
        Assert.assertEquals(ConfigReader.getProperty("ItemNameOnCart"), SearchProductPage.ItemNameOnCart.getText());
        Assert.assertEquals(ConfigReader.getProperty("ItemTotalPrice"), SearchProductPage.ItemPrice.getText());
    }


}
