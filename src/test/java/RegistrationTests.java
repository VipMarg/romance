import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUl {

    @Test
    public void testRegistration() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.completeSecondPartOfRegistration(Data.phone, Data.username,Data.month, Data.day, Data.year, Data.city,Data.location);
       // WebElement checkboxConfirmation= driver.findElement(By.cssSelector("input#confirmation"));
        //        Assert.assertTrue(!driver.findElement(Locators.LINK_SEARCH).isSelected(),"Element is not displayed");
        //        checkboxConfirmation.click();

    }
}
