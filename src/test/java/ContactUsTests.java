import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactUsTests extends BaseUl {



    @Test
    public void clickContactUs(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        contactUsPage.clickLinkContactUs();
        WebElement dropDownListReason = driver.findElement(Locators.DROP_DOWN_LIST_REASON);
        contactUsPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_REASON, 0);
        contactUsPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_REASON,1);
        contactUsPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_REASON,2);
        contactUsPage.completeFilling(Data.username, Data.email, Data.subject,Data.message);

    }






}
