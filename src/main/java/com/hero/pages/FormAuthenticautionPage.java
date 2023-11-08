package com.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FormAuthenticautionPage extends BasePage {
    public FormAuthenticautionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#username")
    WebElement userName;

     @FindBy(css = "#password")
    WebElement userPassword;


    public FormAuthenticautionPage enterData(String name, String password) {
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        return this;
    }



    @FindBy(css = ".radius")
    WebElement loginButton;

    public FormAuthenticautionPage loginButton() {
        loginButton.click();
        return this;
    }


    @FindBy(css = "#flash-messages")
    WebElement verifyLogin;
    public void verifyLogin() {
        Assert.assertTrue(shouldHaveTest(verifyLogin,"You logged",5));
    }
}
