import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeVideoBoxTests extends BaseUl{



    String currentUrl;

    @Test
    public void testHomeVideoBox() {
        WebElement ele = driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX_IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX).click();
    }




}
