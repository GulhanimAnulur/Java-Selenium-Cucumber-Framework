package com.assignment.pages;

import com.assignment.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_05_AddItemToCart_Page extends BasePage {

    public TC_05_AddItemToCart_Page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "//div/div[2]/div/ul/li[4]/a")
    public WebElement LoginText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement LoginEmailAddress;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement LoginPassword;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement RightLoginButton;

    @FindBy(xpath = "(//a[@data-toggle ='collapse'])[1]")
    public WebElement WomenText;

    @FindBy(xpath = "//a[contains(text(),'Dress ')]")
    public WebElement DressTitle;

    @FindBy(xpath = "//a[contains(text(),'Tops ')]")
    public WebElement TopsTitle;

    @FindBy(xpath = "//a[contains(text(),'Saree ')]")
    public WebElement SareeTitle;


    @FindBy(xpath = "//a[@data-product-id='38']")
    public WebElement AddTOCartDress;

    @FindBy(xpath = "//h4[contains(text(),'Added!')]")
    public WebElement VerifyAdded;


    @FindBy(xpath = "//button[@data-dismiss='modal']")
    public WebElement ContinueShoppingButton;

    @FindBy(xpath = "//a[@data-product-id='42']")
    public WebElement AddTOCartTops;

    @FindBy(xpath = "//a[@data-product-id='41']")
    public WebElement AddTOCartSaree;
    @FindBy(xpath = "(//a[@data-toggle='collapse'])[3]")
    public WebElement KidsText;


}
