package com.romanceabroad.ui;

import com.romanceabroad.ui.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTests extends BaseUl {


    int indexLinkSignIn = 0;


    @Test
    public void testSignIn() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();


    }

    @Test(dataProvider = "SignIn2",dataProviderClass = DataProviders.class)
    public void testSignIn2(String email, String password, boolean requirement) {
        System.out.println(email);
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
        mainPage.completeFirstPartOfSignIn(email, Data.password);
        if (requirement) {
            Assert.assertTrue(driver.findElement(Locators.TEXT_ERROR).isDisplayed());
        } else {
            mainPage.clickSignInButton();


        }
    }





}
