package com.assignment.pages;

import com.assignment.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_08_DeleteAccount_Page extends BasePage {
    public TC_08_DeleteAccount_Page(WebDriver driver) {
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

    @FindBy(xpath = "//a[normalize-space(text())='Delete Account']")
    public WebElement DeleteIcon;

    @FindBy(xpath = "//p[contains(text(),'Your account has been permanently deleted!')]")
    public WebElement DeleteTextMessage;
}