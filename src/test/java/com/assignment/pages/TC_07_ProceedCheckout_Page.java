package com.assignment.pages;

import com.assignment.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_07_ProceedCheckout_Page extends BasePage {
    public TC_07_ProceedCheckout_Page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "//a[normalize-space(text())='Cart']")
    public WebElement CartIcon;

    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    public WebElement ProceedButton;

    @FindBy(xpath = "//a[@href='/payment']")
    public WebElement PlaceOrderButton;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement CardNameBox;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement CardNumberBox;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement CVCNumberBox;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement ExpirationMonthBox;

    @FindBy(xpath = "//input[@data-qa='expiry-year']")
    public WebElement ExpirationYearBox;

    @FindBy(xpath = "//button[@data-qa='pay-button']")
    public WebElement PayConfirmOrderButton;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    public WebElement OrderSuccessText;

}

