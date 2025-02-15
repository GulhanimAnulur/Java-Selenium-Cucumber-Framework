package com.assignment.stepdefinitions;

import com.assignment.pages.TC_04_NavigateWomenCategory_Page;
import com.assignment.pages.TC_05_AddItemToCart_Page;
import com.assignment.utils.BasePage;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import com.assignment.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_05_AddItemToCart_StepDefinitions {
    WebDriver driver = DriverManager.getDriver();
    TC_05_AddItemToCart_Page AddItemPage=new TC_05_AddItemToCart_Page(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Then("User login to app")
    public void user_login_to_app() {
        driver.get(ConfigReader.getProperty("baseUrl"));
        AddItemPage.LoginText.click();
        AddItemPage.LoginEmailAddress.sendKeys(ConfigReader.getProperty("existedEmail"));
        AddItemPage.LoginPassword.sendKeys(ConfigReader.getProperty("password"));
        AddItemPage.RightLoginButton.click();

        // Scroll down to the WomenText element

        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", AddItemPage.KidsText);

        // Click on the Women category after scrolling
        AddItemPage.WomenText.click();

    }

    @Given("user views the DRESS category and click on it")
    public void user_views_the_dress_category_and_click_on_it() throws InterruptedException {
        TestUtils.setImplicitWait(driver, 3);
        AddItemPage.DressTitle.click();
    }

    @When("user scrolls to the last item1")
    public void user_scrolls_to_the_last_item1() {
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", AddItemPage.AddTOCartDress);

    }

    @When("User clicks on Add to Cart1")
    public void user_clicks_on_add_to_cart1() {
        AddItemPage.AddTOCartDress.click();
    }

    @Then("Verify the confirmation message that Your product has been added to cart1")
    public void verify_the_confirmation_message_that_your_product_has_been_added_to_cart1() {
        DriverManager.waitForVisibility(AddItemPage.VerifyAdded,3);
        Assert.assertEquals(ConfigReader.getProperty("ConfirmationMessage"), AddItemPage.VerifyAdded.getText());
    }

    @Then("User clicks on continue button1")
    public void user_clicks_on_view_cart_button1() {
        AddItemPage.ContinueShoppingButton.click();
        TestUtils.setImplicitWait(driver, 3);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", AddItemPage.WomenText);

        AddItemPage.WomenText.click();


    }


    @Then("user views the TOPS category and click on it")
    public void user_views_the_tops_category_and_click_on_it() {
        AddItemPage.TopsTitle.click();
    }

    @Then("user scrolls to the last item2")
    public void user_scrolls_to_the_last_item2() {
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", AddItemPage.AddTOCartTops);
    }

    @Then("User clicks on Add to Cart2")
    public void user_clicks_on_add_to_cart2() {
        AddItemPage.AddTOCartTops.click();

    }

    @Then("Verify the confirmation message that Your product has been added to cart2")
    public void verify_the_confirmation_message_that_your_product_has_been_added_to_cart2() {
        DriverManager.waitForVisibility(AddItemPage.VerifyAdded,3);
        Assert.assertEquals(ConfigReader.getProperty("ConfirmationMessage"), AddItemPage.VerifyAdded.getText());
    }

    @Then("User clicks on continue button2")
    public void user_clicks_on_view_cart_button2() {
        AddItemPage.ContinueShoppingButton.click();
        TestUtils.setImplicitWait(driver, 3);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", AddItemPage.WomenText);

        AddItemPage.WomenText.click();
    }

    @Then("user views the SAREE category and click on it")
    public void user_views_the_saree_category_and_click_on_it() {
      AddItemPage.SareeTitle.click();
    }

    @Then("user scrolls to the last item3")
    public void user_scrolls_to_the_last_item3() {
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", AddItemPage.AddTOCartSaree);
    }

    @Then("User clicks on Add to Cart3")
    public void user_clicks_on_add_to_cart3() {
        AddItemPage.AddTOCartSaree.click();
    }

    @Then("Verify the confirmation message that Your product has been added to cart3")
    public void verify_the_confirmation_message_that_your_product_has_been_added_to_cart3() {
        DriverManager.waitForVisibility(AddItemPage.VerifyAdded,3);
        Assert.assertEquals(ConfigReader.getProperty("ConfirmationMessage"), AddItemPage.VerifyAdded.getText());
    }



    @Then("User clicks on continue button3")
    public void user_clicks_on_home_button3() {
        AddItemPage.ContinueShoppingButton.click();
        TestUtils.setImplicitWait(driver, 3);
    }



}
