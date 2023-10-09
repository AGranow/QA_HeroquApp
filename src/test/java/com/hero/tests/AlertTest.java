package com.hero.tests;

import com.hero.pages.AlertsPage;
import com.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends TestBase {

    //click on link JavaScript Alerts
    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getAlerts();
    }

    @Test
    public void acceptAlert() {
        //click on the button Click for JS Alert
        //click on OK
        //assert text resalt 'You successfully clicked an alert'

        new AlertsPage(driver)
                .clickOnAlertButton()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }

    @Test
//click on the button Click for JS Confirm
//select ok | cancel
//assert text result ok | cancel
    public void confirmAlertTest() {
        new AlertsPage(driver)
                .clickOnConfirmButton()
                .selectConfirm("cancel")
                .verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAllert() {
        //click on the button Click for JS Prompt
        //enter 'Hello World!!!'
        //click on OK
        //assert text result 'Hello World!!!'

        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAllert("Hello World!!!")
                .acceptAlert()
                .verifyResult("Hello World!!!");
    }


}
