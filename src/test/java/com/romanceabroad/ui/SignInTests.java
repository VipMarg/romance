package com.romanceabroad.ui;

import com.romanceabroad.ui.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTests extends BaseUl {





    @Test
    public void testSignIn() {
        driver.findElement(Locators.LINK_SIGN_IN).click();


    }

    @Test(dataProvider = "SignIn2",dataProviderClass = DataProviders.class)
    public void testSignIn2(String email, String password, boolean requirement) {
        System.out.println(email);
        driver.findElement(Locators.LINK_SIGN_IN).click();
        mainPage.completeFirstPartOfSignIn(email, Data.password);
        mainPage.clickSignInButton();
        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TEXT_ERROR).isDisplayed());
        }

    }
    @Test(dataProvider = "NewRequirementsForPassword", dataProviderClass = DataProviders.class)
    public void password(String password, boolean requirement){
    mainPage.clickLinkSignIn();
    mainPage.fillInSignInForm(password);
    if(!requirement){
        Assert.assertTrue(driver.findElement(Locators.TEXT_ERROR).isDisplayed());
    }

    }




}
