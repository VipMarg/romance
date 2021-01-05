package com.romanceabroad.ui;

import com.romanceabroad.ui.BaseActions;
import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;


public class MainPage extends BaseActions {

    int indexLinkSignIn = 0;
    public MainPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);



    }

    public void clickJoinButton(){
        Reports.log("Wait Join Button");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         //or wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
        //driver.findElement(Locators.BUTTON_REGISTRATION).click(); or
        Reports.log("Click Join Button");
        performClick(Locators.BUTTON_REGISTRATION);
    }
    public void completeFirstPartOfRegistration(String email, String password){
        Reports.log("Wait email text field");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Reports.log("Type email in text field:" + email);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);

        Reports.log("Wait password text field:" + password);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));

        Reports.log("Type password in text field:" + password);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);

    }

    public void clickNextButton(){
        Reports.log("Wait Next Button");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));

        Reports.log("Click Next Button");
        driver.findElement(Locators.BUTTON_NEXT).click();
    }
    public void completeSecondPartOfRegistration( String username, String day, String month,
                                                  String year, String phone,String city, String location){

        Reports.log("Type username:" + username);
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(username);

        Reports.log("Click list of days");
        driver.findElement(Locators.LISTS_DAYS_SELECT).click();

        Reports.log("Select specific day:"+ day);
        clickValueOfLists(Locators.LIST_VALUE_DAY, day);

        Reports.log("Click list of month");
        driver.findElement(Locators.LISTS_MONTHS_SELECT).click();

        Reports.log("Select specific month:"+ month);
        clickValueOfLists(Locators.LIST_VALUE_MONTH, month);

        Reports.log("Click list of years");
        driver.findElement(Locators.LISTS_YEARS_SELECT).click();

        Reports.log("Select specific year:"+ year);
        clickValueOfLists(Locators.LIST_VALUE_YEAR, year);

        Reports.log("Type phone number:" + phone );
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);

        Reports.log("Clean location autofilling form");
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();

        Reports.log("Type any of city:"+ city);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);

        Reports.log("Select specific location:"+ location);
        clickValueOfLists(Locators.LIST_VALUE_LOCATION,location);

        Reports.log("Click check box");
        wait.until(ExpectedConditions.presenceOfElementLocated(Locators.CHECK_BOX_CONFIRMATION));
        wait.until(ExpectedConditions.elementToBeClickable(Locators.CHECK_BOX_CONFIRMATION));
        ajaxClick(driver.findElement(Locators.CHECK_BOX_CONFIRMATION));
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
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();

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
