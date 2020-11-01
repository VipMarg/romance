import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUl {

    String currentUrl;

    @Test
    public void testBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlBlog);

    }


}
