import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SupportTests extends BaseUl {


    @Test
    public void testSupport() {
        driver.findElement(Locators.LINK_SUPPORT).click();

    }
}
