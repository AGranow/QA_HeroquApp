package com.hero.tests;

import com.hero.pages.HomePage;
import com.hero.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase{


    @BeforeMethod
    public void Precondition(){
        // click on Multiple Windows link
        new HomePage(driver).detMultipleWindows();
    }

    @Test
    public void switchToNewTabTest(){
        //    click on Click here link und switch
        // assert New tab
        new WindowPage(driver)
                .switchToNewTab(1)
                .verifyNewTabTitle("New Window");
    }

}
