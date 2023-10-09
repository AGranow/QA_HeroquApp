package com.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement alertsLink;

    public AlertsPage getAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }


    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowsLink;

    public WindowPage detMultipleWindows() {
        click(windowsLink);
        return new WindowPage(driver);
    }


    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;


    public JSExecutor getFormAuthenticaution() {
        click(formLink);
        return new JSExecutor(driver);


    }
}