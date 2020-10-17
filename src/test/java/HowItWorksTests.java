import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowItWorksTests extends BaseUl {

    String currentUrl;


    @Test
    public void testHowItWorks() {
        driver.findElement(Locators.LINK_HOWITWORKS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHowItWorks);
    }


}
