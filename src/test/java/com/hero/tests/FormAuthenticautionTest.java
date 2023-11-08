package com.hero.tests;

import com.hero.data.UserData;
import com.hero.pages.AlertsPage;
import com.hero.pages.FormAuthenticautionPage;
import com.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormAuthenticautionTest extends TestBase{

    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getFormAuthenticaution();
    }

    @Test
    public void FormAuthenticautionTest() {
        new FormAuthenticautionPage(driver)
                .enterData(UserData.USER_NAME, UserData.USER_PASSWORD)
                .loginButton()
                .verifyLogin();
    }

}
