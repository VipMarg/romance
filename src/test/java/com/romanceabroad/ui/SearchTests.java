package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUl {

    String currentUrlSearch;
    public static final boolean testCase1 = true;
    public static final boolean testCase2 = false;
    public static final boolean testCase3 = true;
    public static final boolean testCase4 = true;


    @Test
    public void testSearchPageTestCase() {
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals(currentUrlSearch, com.romanceabroad.ui.Data.expectedUrlSearch);


        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByIndex(2);*/

        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "default");
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "name");
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "views_count");
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "date_created");
        softAssert.assertAll();

    }

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(3);
        }

    }

    @Test(priority = 2, enabled = testCase1, groups = {"user", "admin"})
    public void selectRandomDropDownListTestCase1() {
        searchPage.clickPrettyWomenLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }

    }

    @Test(priority = 3, enabled = testCase2, groups = {"user", "admin"})
    public void verificationsTestCase2() {
        Assert.assertEquals("Web", "Web");
        //Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(),"Element is not displayed");
        Assert.fail("Element is not displayed");


    }

    @Test(priority = 4, enabled = testCase3, groups = {"user"})
    public void testSearchPageTestCase3() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.clickPrettyWomenLink();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
        softAssert.assertAll();

    }

    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 1, enabled = testCase4, groups = {"user", "admin"})
    public void searchDifferentResultsTestCase4(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        //System.out.println(min);
        //System.out.println(max);

        searchPage.clickPrettyWomenLink();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MIN_AGE), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MAX_AGE), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY), sortBy);
        searchPage.clickSearchButton();

        List<WebElement> infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);
        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                String[] splitedPhrase = info.split(", ");
                String age = splitedPhrase[1];
                int ageNum = Integer.parseInt(age);

                if (min <= ageNum || ageNum <= max) {
                    System.out.println("This age: " + ageNum + "is correct");
                } else {
                    Assert.fail("Wrong age: " + ageNum);
                }
            }
            //mainPage.javaWaitSec(3);
            infoAboutUser = driver.findElements(Locators.TEXT_USER_INFO);
        }

    }


}







