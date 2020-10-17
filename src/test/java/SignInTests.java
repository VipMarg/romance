import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTests extends BaseUl {


    int indexLinkSignIn = 0;


    @Test
    public void testSign_In() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();


    }
}
