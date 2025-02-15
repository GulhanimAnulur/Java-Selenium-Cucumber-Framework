package com.assignment.stepdefinitions;

import com.assignment.pages.TC_02_SignUpSuccess_Page;
import com.assignment.pages.TC_03_LoginExistingUser_Page;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC_03_LoginExistingUser_StepDefinitions {
    WebDriver driver = DriverManager.getDriver();
    TC_03_LoginExistingUser_Page ExistingUser=new TC_03_LoginExistingUser_Page(driver);

    @When("User navigates to the Login Sign Up page")
    public void userNavigatesToTheLoginSignUpPage() {
        driver.get(ConfigReader.getProperty("baseUrl"));
    }
    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        ExistingUser.LoginText.click();
    }
    @Then("User enters the new user's credentials")
    public void user_enters_the_new_user_s_credentials() {
        ExistingUser.LoginEmailAddress.sendKeys(ConfigReader.getProperty("existedEmail"));
        ExistingUser.LoginPassword.sendKeys(ConfigReader.getProperty("password"));
        ExistingUser.RightLoginButton.click();

    }
    @Then("Verify that you are redirected to the user dashboard and see the message: \"Logged in as Username")
    public void verify_that_you_are_redirected_to_the_user_dashboard_and_see_the_message_logged_in_as_username() {
        Assert.assertTrue(ExistingUser.VerifyExistingUserName.isDisplayed());}


}


