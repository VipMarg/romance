import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUl {

    String currentUrlSearch;
    public static final boolean testCase1= false;
    public static final boolean testCase2= true;
    public static final boolean testCase3= true;



    @Test (priority = 1,enabled = testCase1,groups = {"user"})
    public void testSearchPageTestCase1() {
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);


        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByIndex(2);*/

        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen,"Url is wrong");
        WebElement dropDownListSortBy=driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
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
        int sizeOfDropDownListSortBy= searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(3);
        }

    }

    @Test (priority = 2,enabled = testCase3,groups = {"user","admin"})
    public void selectRandomDropDownListTestCase2() {
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        int sizeOfDropDownListSortBy= searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }

        }

        @Test (priority = 3,enabled = testCase3,groups = {"user","admin"})
    public void verificationsTestCase3(){
        Assert.assertEquals("Web","Web");
        }



    }







