package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseActions;
import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class MainPage extends BaseActions {
    int indexButtonNext = 1;
    int indexLinkSignIn = 0;
    public MainPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);



    }

    public void clickJoinButton(){
        //driver.findElement(com.romanceabroad.ui.Locators.BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        performClick(Locators.BUTTON_REGISTRATION);
    }
    public void completeFirstPartOfRegistration(String email, String password){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
    }

    public void clickNextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }
    public void completeSecondPartOfRegistration( String username, String day, String month,
                                                  String year, String phone,String city, String location){
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(username);
        driver.findElement(Locators.LISTS_DAYS_SELECT).click();
        clickValueOfLists(Locators.LIST_VALUE_DAY, day);
        driver.findElement(Locators.LISTS_MONTHS_SELECT).click();
        clickValueOfLists(Locators.LIST_VALUE_MONTH, month);
        driver.findElement(Locators.LISTS_YEARS_SELECT).click();
        clickValueOfLists(Locators.LIST_VALUE_YEAR, year);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
        clickValueOfLists(Locators.LIST_VALUE_LOCATION,location);
        driver.findElement(Locators.CHECK_BOX_CONFIRMATION).click();
    }

    public void clickRequestTourInfoButton(){
        driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO).click();
    }

    public void clickLinkJoinToday(){
        driver.findElement(Locators.LINK_JOIN_TODAY).click();
    }
    public void completeJoinTodayRegistration(){
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElements(Locators.BUTTON_NEXT).get(indexButtonNext).click();

    }

    public void clickButtonVideoBox(){
        WebElement ele = driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX_IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX).click();
    }

    public void clickLinkMailSupport(){
        driver.findElement(Locators.LINK_MAIL_SUPPORT).click();
    }

    public void clickLinkHowItWorks(){
        driver.findElement(Locators.LINK_HOWITWORKS).click();


    }


    public void clickLinkSignIn(){
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }
    public void completeFirstPartOfSignIn(String email, String password){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL3).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD3).sendKeys(password);

    }
    public void clickSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SIGN_IN));
        driver.findElement(Locators.BUTTON_SIGN_IN).click();
    }



}
