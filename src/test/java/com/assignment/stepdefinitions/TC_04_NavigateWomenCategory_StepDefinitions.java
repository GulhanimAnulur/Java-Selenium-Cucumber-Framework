package com.assignment.stepdefinitions;

import com.assignment.pages.TC_03_LoginExistingUser_Page;
import com.assignment.pages.TC_04_NavigateWomenCategory_Page;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import com.assignment.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_04_NavigateWomenCategory_StepDefinitions {
    WebDriver driver = DriverManager.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    TC_04_NavigateWomenCategory_Page WomenCategoryPage=new TC_04_NavigateWomenCategory_Page(driver);

    @Then("User login to app.")
    public void user_login_to_app() {
        driver.get(ConfigReader.getProperty("baseUrl"));
        WomenCategoryPage.LoginText.click();
        WomenCategoryPage.LoginEmailAddress.sendKeys(ConfigReader.getProperty("existedEmail"));
        WomenCategoryPage.LoginPassword.sendKeys(ConfigReader.getProperty("password"));
        WomenCategoryPage.RightLoginButton.click();
        TestUtils.setImplicitWait(driver, 3);

    }
    @When("user clicks on the women text under the category")
    public void user_clicks_on_the_women_text_under_the_category() {
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", WomenCategoryPage.KidsText);
        WomenCategoryPage.WomenText.click();
    }
    @Then("User verifies that the options for dress, tops and saree are displayed")
    public void user_verifies_that_the_options_for_dress_tops_and_saree_are_displayed() {
        DriverManager.waitForVisibility(WomenCategoryPage.DressTitle,3);
        Assert.assertTrue(WomenCategoryPage.DressTitle.isDisplayed());
        DriverManager.waitForVisibility(WomenCategoryPage.TopsTitle,3);
        Assert.assertTrue(WomenCategoryPage.TopsTitle.isDisplayed());
        DriverManager.waitForVisibility(WomenCategoryPage.SareeTitle,3);
        Assert.assertTrue(WomenCategoryPage.SareeTitle.isDisplayed());

    }

}
