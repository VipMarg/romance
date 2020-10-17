import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTests extends BaseUl {

    String currentUrl;

    @Test
    public void testView() {
        driver.findElement(Locators.LINK_VIEW).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlView);

    }


}
