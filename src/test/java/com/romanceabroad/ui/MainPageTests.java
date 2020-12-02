package com.romanceabroad.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUl {


    @Test
    public void testLinksOnMainPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");

    }
   @Test
   public void smokeTestMainPage(){
       List<WebElement>mainTabs= driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
       for (int i = 0; i < mainTabs.size(); i++) {
          mainTabs.get(i).click();
          driver.get(Data.mainUrl);
          mainTabs= driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));

       }
   }



    @Test
    public void testSupport() {
        mainPage.clickLinkMailSupport();

    }
    @Test
    public void testRequestTourInfo() {
        mainPage.clickRequestTourInfoButton();
        Assert.assertTrue(driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO).isDisplayed(),"Element is displayed");
        System.out.println("Element is displayed");

    }

    @Test
    public void testHomeVideoBox() {
        mainPage.clickButtonVideoBox();
        Assert.assertTrue(driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX).isDisplayed(),"Element is displayed");
        System.out.println("Element is displayed");

    }




}
