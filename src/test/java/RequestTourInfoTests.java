import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RequestTourInfoTests extends BaseUl {


    @Test
    public void testRequestTourInfo() {
        driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO).click();

    }
}
