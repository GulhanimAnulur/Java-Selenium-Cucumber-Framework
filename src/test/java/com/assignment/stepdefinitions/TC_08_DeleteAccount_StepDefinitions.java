package com.assignment.stepdefinitions;

import com.assignment.pages.TC_07_ProceedCheckout_Page;
import com.assignment.pages.TC_08_DeleteAccount_Page;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import com.assignment.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_08_DeleteAccount_StepDefinitions {

    WebDriver driver = DriverManager.getDriver();
    TC_08_DeleteAccount_Page DeleteAccountPage=new TC_08_DeleteAccount_Page(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @When("user clicks on delete account button")
    public void user_clicks_on_delete_account_button() {
        TestUtils.setImplicitWait(driver, 3);
        DeleteAccountPage.DeleteIcon.click();

    }
    @Then("User Verifies the message account is deleted")
    public void user_verifies_the_message_account_is_deleted() {
        DriverManager.waitForVisibility(DeleteAccountPage.DeleteTextMessage,3);
        Assert.assertEquals(ConfigReader.getProperty("DeleteTextMessage"), DeleteAccountPage.DeleteTextMessage.getText());
    }

}
