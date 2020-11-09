import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUl {

    String currentUrl;


    @Test
    public void testSearch() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //Assert.assertEquals(currentUrl, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByIndex(2);*/

        softAssert.assertEquals(currentUrl, Data.expectedUrlPrettyWomen,"Url is wrong");
        WebElement dropDownListSortBy=driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "default");
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "name");
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "views_count");
        searchPage.getDropDownListByValue(Locators.DROP_DOWN_LIST_SORT_BY, "date_created");
        softAssert.assertAll();

    }




}
