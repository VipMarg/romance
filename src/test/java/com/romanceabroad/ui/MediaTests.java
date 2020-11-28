package com.romanceabroad.ui;

import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUl {

    String currentUrlMedia;



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
        mediaPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY,"date_add");
        mediaPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY,"views");
        mediaPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_MEDIA_SORT_BY,"comments_count");
        WebElement dropDownListAddPhoto = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA_ADD_PHOTO);


    }


}