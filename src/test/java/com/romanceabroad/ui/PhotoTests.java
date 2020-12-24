package com.romanceabroad.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PhotoTests extends BaseUl {

    String currentUrlMedia;
    String actualTitle;


    @Test
    public void testMedia() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /*Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
        select.selectByIndex(1);*/


        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY);
        mediaPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY, "date_add");
        mediaPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY, "views");
        mediaPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY, "comments_count");
        WebElement dropDownListAddPhoto = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_ADD_PHOTO);

    }

    @Test
    public void testUserTabs() {
        mediaPage.clickPhotosTab();
        List<WebElement> userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = mediaPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);

        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            actualTitle = mediaPage.getAnyTitle();
            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }

            userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);

        }
    }

    @Test
    public void testUserTabs2() {
        mediaPage.clickPhotosTab();
        List<WebElement> userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = mediaPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);

        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            actualTitle = mediaPage.getAnyTitle();
            if (actualTitle.contains(Data.expectedTitleGallery) || actualTitle.contains(Data.expectedTitlePhotoGallery)
                    || actualTitle.contains(Data.expectedTitleVideoGallery) || actualTitle.contains(Data.expectedTitleGalleryAlbums)) {

                System.out.println("Title is valid: " + actualTitle);
            }else{
                Assert.fail("Title is not valid");
            }
            userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);

        }

    }

    @Test
    public void testUserTabs3() {
        mediaPage.clickPhotosTab();
        List<WebElement> userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = mediaPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);
        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            actualTitle = mediaPage.getAnyTitle();
            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
                //mainPage.ajaxClick(By.xpath("//div[@class='g-flatty-block']"));
                String textMedia= driver.findElement
                        (By.xpath("//div[@class='g-flatty-block']")).getText();
                System.out.println(textMedia);
                if (textMedia.contains(Data.textMedia)){
                    System.out.println("Text media is correct!");
                }
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
                //mainPage.ajaxClick(By.xpath("//div[@class='main-inner-content']"));
                mainPage.javaWaitSec(2);
                Assert.assertTrue(driver.findElement
                        (By.xpath("//span[@data-click='album']")).isDisplayed());
            }
            userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);

        }
    }





}
