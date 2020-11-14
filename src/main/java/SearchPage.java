import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Transient;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickButtonSearch(){
        driver.findElement(Locators.BUTTON_SEARCH).click();


    }


}
