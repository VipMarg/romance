import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUl {

    String currentUrl;

    @Test
    public void testStore() {
        driver.findElement(Locators.LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlStore);

    }
}
