package com.hero.tests;

import com.hero.data.UserData;
import com.hero.pages.HomePage;
import com.hero.pages.JSExecutor;
import org.testng.annotations.Test;

public class FormAuthenticautionJSExecutorTest extends TestBase{

    @Test
    public void formAuthenticautionJSExecutorTest(){
        new HomePage(driver).getFormAuthenticaution();
        new JSExecutor(driver)
                .enterDataWithJSE(UserData.USER_NAME, UserData.USER_PASSWORD)
                .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();

    }
}
