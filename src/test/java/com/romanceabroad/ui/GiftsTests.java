package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class GiftsTests  {

    String currentUrlGifts;

    /*@Test
    public void testStore() {
        driver.findElement(com.romanceabroad.ui.Locators.LINK_GIFTS).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, com.romanceabroad.ui.Data.expectedUrlGifts);

    }*/
    @DataProvider(name="Gifts")
    public static Object[][]testGifts()throws Exception{
        ArrayList<Object[]> out= new ArrayList<>();
        Files.readAllLines(Paths.get("Gifts.csv")).stream().forEach(s ->{
            String []data= s.split(",");
            out.add(new Object[]{data[0]});

        });
        return out.toArray(new Object[out.size()][]);

    }

    @Test(dataProvider = "Gifts")
    public void testGifts(String Flower) {
        System.out.println(Flower);
       /* driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(com.romanceabroad.ui.Data.email, com.romanceabroad.ui.Data.password);
        mainPage.completeSecondPartOfRegistration(com.romanceabroad.ui.Data.phone, com.romanceabroad.ui.Data.username, com.romanceabroad.ui.Data.month, com.romanceabroad.ui.Data.day, com.romanceabroad.ui.Data.year, com.romanceabroad.ui.Data.city, com.romanceabroad.ui.Data.location);*/


    }



}