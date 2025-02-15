package com.assignment.pages;

import com.assignment.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_06_SearchProduct_Page extends BasePage {
    public TC_06_SearchProduct_Page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "(//a[@href='/products'])[1]")
    public WebElement ProductButton;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement SearchBox;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement SearchIcon;

    @FindBy(xpath = "//a[@data-product-id='42']")
    public WebElement TopLastItem;

    @FindBy(xpath = "//h4[contains(text(),'Added!')]")
    public WebElement VerifyAdded;

    @FindBy(xpath = "//a[u[normalize-space(text())='View Cart']]")
    public WebElement ViewCartLink;

    @FindBy(xpath = "//a[contains(text(),'Lace Top For Women')]")
    public WebElement ItemNameOnCart;

    @FindBy(xpath = "//p[contains(text(),'Rs. 1400')]")
    public WebElement ItemPrice;


}
