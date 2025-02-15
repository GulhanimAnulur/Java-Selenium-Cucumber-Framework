package com.assignment.pages;

import com.assignment.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_01_NavigateLoginPage extends BasePage {

    public TC_01_NavigateLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div/div[2]/div/ul/li[4]/a")
    public WebElement LoginText;

    public boolean isLoginTextDisplayed() {
        return isDisplayed(LoginText);
    }
}
