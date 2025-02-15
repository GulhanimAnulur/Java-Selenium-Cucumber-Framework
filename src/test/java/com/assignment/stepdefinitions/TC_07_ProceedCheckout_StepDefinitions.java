package com.assignment.stepdefinitions;

import com.assignment.pages.TC_06_SearchProduct_Page;
import com.assignment.pages.TC_07_ProceedCheckout_Page;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import com.assignment.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_07_ProceedCheckout_StepDefinitions {
    WebDriver driver = DriverManager.getDriver();
    TC_07_ProceedCheckout_Page ProceedCheckoutPage=new TC_07_ProceedCheckout_Page(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Given("User clicks on cart icon")
    public void user_clicks_on_cart_icon() {
        ProceedCheckoutPage.CartIcon.click();
        TestUtils.setImplicitWait(driver, 3);
    }
    @When("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
     ProceedCheckoutPage.ProceedButton.click();
        TestUtils.setImplicitWait(driver, 3);

    }
    @When("User scrolls to bottom and click on place order button")
    public void user_scrolls_to_bottom_and_click_on_place_order_button() {
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", ProceedCheckoutPage.PlaceOrderButton);
        TestUtils.setImplicitWait(driver, 3);
        ProceedCheckoutPage.PlaceOrderButton.click();
        TestUtils.setImplicitWait(driver, 3);
    }
    @Then("user enters the payment details and clicks on pay and confirm order")
    public void user_enters_the_payment_details_and_clicks_on_pay_and_confirm_order() {
        ProceedCheckoutPage.CardNameBox.sendKeys(ConfigReader.getProperty("CardNumber"));
        ProceedCheckoutPage.CardNumberBox.sendKeys(ConfigReader.getProperty("CardName"));
        ProceedCheckoutPage.CVCNumberBox.sendKeys(ConfigReader.getProperty("CVCNumber"));
        ProceedCheckoutPage.ExpirationMonthBox.sendKeys(ConfigReader.getProperty("ExpirationMonth"));
        ProceedCheckoutPage.ExpirationYearBox.sendKeys(ConfigReader.getProperty("ExpirationYear"));
        ProceedCheckoutPage.PayConfirmOrderButton.click();


    }

    @Then("User verifies order successful message that Congratulations! Your order has been confirmed!")
    public void user_verifies_order_successful_message_that_congratulations_your_order_has_been_confirmed() {
        DriverManager.waitForVisibility(ProceedCheckoutPage.OrderSuccessText,3);
        Assert.assertEquals(ConfigReader.getProperty("OrderSuccessText"), ProceedCheckoutPage.OrderSuccessText.getText());
    }



}
