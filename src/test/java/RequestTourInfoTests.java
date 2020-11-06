import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestTourInfoTests extends BaseUl {


    @Test
    public void testRequestTourInfo() {
        mainPage.clickRequestTourInfoButton();
        Assert.assertTrue(driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO).isDisplayed(),"Element is displayed");
        System.out.println("Element is displayed");

    }
}
