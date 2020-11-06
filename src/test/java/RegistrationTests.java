import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUl {

    @Test
    public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkboxConfirmation= driver.findElement(By.cssSelector("input#confirmation"));
        Assert.assertTrue(!driver.findElement(Locators.LINK_SEARCH).isSelected(),"Element is not displayed");
        checkboxConfirmation.click();

    }
}
