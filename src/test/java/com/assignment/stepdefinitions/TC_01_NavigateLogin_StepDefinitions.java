package com.assignment.stepdefinitions;

import com.assignment.pages.TC_01_NavigateLoginPage;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC_01_NavigateLogin_StepDefinitions {
    WebDriver driver = DriverManager.getDriver();
    TC_01_NavigateLoginPage navigateLogin = new TC_01_NavigateLoginPage(driver);

    @When("user goes to the login page")
    public void user_goes_to_the_login_page() {
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("verify the login text in the top right corner of the app.")
    public void verify_the_login_text_in_the_top_right_corner_of_the_app() {
        Assert.assertTrue(navigateLogin.isLoginTextDisplayed());
    }
}
