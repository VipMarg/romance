import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUl {

    String currentUrl;

    @Test
    public void testStore() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlGifts);

    }
}
