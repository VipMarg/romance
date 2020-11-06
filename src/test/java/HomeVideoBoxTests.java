import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeVideoBoxTests extends BaseUl{



    String currentUrl;

    @Test
    public void testHomeVideoBox() {
        mainPage.clickButtonVideoBox();
        Assert.assertTrue(driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX).isDisplayed(),"Element is displayed");
        System.out.println("Element is displayed");

    }




}
