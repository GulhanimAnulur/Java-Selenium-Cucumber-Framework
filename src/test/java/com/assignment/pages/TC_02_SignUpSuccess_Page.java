package com.assignment.pages;

import com.assignment.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_02_SignUpSuccess_Page extends BasePage {

    public TC_02_SignUpSuccess_Page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div/div[2]/div/ul/li[4]/a")
    public WebElement LoginText;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement UserName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement Emailaddress;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement SighUpButton;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement TitleRadioButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordBox;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement DayDropDown;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement Option10;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement MonthDropDown;
    @FindBy(xpath = "(//option[@value='1'])[2]")
    public WebElement OptionJanuary;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement YearDropdown;

    @FindBy(xpath = "//option[@value='2010']")
    public WebElement Option2010;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement CompanyName;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement AddressBox1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement AddressBox2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement CountryDropDown;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement SelectCountry;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement StateBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement CityBox;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement Zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement MobileNumber;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement CreateAccountButton;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement CreatedMessage;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been successfully created!')]")
    public WebElement CongratsMessage;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement ContinueButton;
    @FindBy(xpath = "//i[contains(text(),'Logout')]")
    public WebElement LogoutButton;

}
