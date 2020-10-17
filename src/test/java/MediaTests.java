import org.openqa.selenium.By;
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

    }
}
