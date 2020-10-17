import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JoinTodayTests extends BaseUl {


    int indexButtonNext = 1;

    @Test
    public void testJoinToday() {
        driver.findElement(Locators.BUTTON_JOIN_TODAY).click();
        driver.findElement(Locators.TEXT_FIELD_JOINEMAIL).sendKeys("11@gmail.com");
        driver.findElement(Locators.TEXT_FIELD_JOINPASSWORD).sendKeys("11@gmail.com");
        driver.findElements(Locators.BUTTON_JOINNEXT).get(indexButtonNext).click();
    }
}
