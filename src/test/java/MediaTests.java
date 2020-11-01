import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUl {

    String currentUrl;



    @Test
    public void testMedia() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
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