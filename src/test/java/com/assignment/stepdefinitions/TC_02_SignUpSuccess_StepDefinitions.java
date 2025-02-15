package com.assignment.stepdefinitions;

import com.assignment.pages.TC_02_SignUpSuccess_Page;
import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import com.assignment.utils.TestUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class TC_02_SignUpSuccess_StepDefinitions {
    //Random random = new Random();
    //int randomNumber = random.nextInt(101);
    WebDriver driver = DriverManager.getDriver();

    TC_02_SignUpSuccess_Page SignUpPage=new TC_02_SignUpSuccess_Page(driver);
    Select select;
    @When("User goes to login page")
    public void user_goes_to_login_page() {
       // driver.get(ConfigReader.getProperty("baseUrl"));

    }
    @Then("User clicks on login")
    public void user_clicks_on_login() {
        SignUpPage.LoginText.click();
    }
    @Then("User enters correct username-email address")
    public void user_enters_correct_username_email_address() {
   SignUpPage.UserName.sendKeys(ConfigReader.getProperty("name"));

   //SignUpPage.Emailaddress.sendKeys("tom.william"+randomNumber+"@rautenstrauch.com");
        SignUpPage.Emailaddress.sendKeys(ConfigReader.getProperty("existedEmail"));
        SignUpPage.SighUpButton.click();
        TestUtils.setImplicitWait(driver, 3);
    }


    @Then("User enters account information")
    public void user_enters_account_information() {
     SignUpPage.TitleRadioButton.click();
     SignUpPage.PasswordBox.sendKeys(ConfigReader.getProperty("password"));
      select=new Select(SignUpPage.DayDropDown);
        select.selectByIndex(10);
        //Assert.assertTrue(SignUpPage.Option10.isSelected());

        select=new Select(SignUpPage.MonthDropDown);
        select.selectByIndex(1);
        //Assert.assertTrue(SignUpPage.OptionJanuary.isSelected());

        select=new Select(SignUpPage.YearDropdown);
        select.selectByIndex(12);
        //Assert.assertTrue(SignUpPage.Option2010.isSelected());

        SignUpPage.FirstName.sendKeys(ConfigReader.getProperty("name"));
        SignUpPage.LastName.sendKeys(ConfigReader.getProperty("lastname"));
        SignUpPage.CompanyName.sendKeys(ConfigReader.getProperty("companyName"));
        SignUpPage.AddressBox1.sendKeys(ConfigReader.getProperty("address"));
        SignUpPage.AddressBox2.sendKeys(ConfigReader.getProperty("address"));

        select=new Select(SignUpPage.CountryDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("country"));
        //Assert.assertTrue(SignUpPage.SelectCountry.isSelected());

        SignUpPage.StateBox.sendKeys(ConfigReader.getProperty("province"));
        SignUpPage.CityBox.sendKeys(ConfigReader.getProperty("city"));
        SignUpPage.Zipcode.sendKeys(ConfigReader.getProperty("zipCode"));
        SignUpPage.MobileNumber.sendKeys(ConfigReader.getProperty("phone"));


    }
    @Then("User clicks create account button")
    public void user_clicks_create_account_button() {
        SignUpPage.CreateAccountButton.click();

    }
    @Then("Verify the message is displayed")
    public void verify_the_message_is_displayed() {
        Assert.assertEquals(ConfigReader.getProperty("accountMessage"), SignUpPage.CreatedMessage.getText());

    }
    @Then("Verify that Congratulations! Your new account has been successfully created! is displayed")
    public void verify_that_congratulations_your_new_account_has_been_successfully_created_is_displayed() {
        Assert.assertEquals(ConfigReader.getProperty("successMessage"), SignUpPage.CongratsMessage.getText());
        SignUpPage.ContinueButton.click();
    }
    @Then("And User closes the page")
    public void and_user_closes_the_page() {
        driver.quit();

    }


}
