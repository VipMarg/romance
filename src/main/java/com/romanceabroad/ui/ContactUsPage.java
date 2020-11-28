package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContactUsPage  extends BaseActions {

    public ContactUsPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    String currentUrlContactUs;

    public void clickLinkContactUs() {
        driver.findElement(Locators.LINK_MEDIA).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_CONTACT_US).click();
    }

    public void completeFilling(String name,String email, String subject, String message){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.DROP_DOWN_LIST_REASON).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_YOUR_NAME).sendKeys(name);
        driver.findElement(Locators.TEXT_FIELD_YOUR_EMAIL).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_SUBJECT).sendKeys(subject);
        driver.findElement(Locators.TEXT_FIELD_MESSAGE).sendKeys(message);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_SEND).click();




    }






}
