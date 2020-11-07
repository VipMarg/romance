import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class MainPage extends BaseActions {
    int indexButtonNext = 1;

    public MainPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);


    }


    public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }
    public void completeFirstPartOfRegistration(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
    }
    public void completeSecondPartOfRegistration(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(Data.username);
        driver.findElement(Locators.BUTTON_DAY_SELECT).click();
        driver.findElement(Locators.LIST_DAY_SELECT).click();
        driver.findElement(Locators.BUTTON_MONTH_SELECT).click();
        driver.findElement(Locators.LIST_MONTH_SELECT).click();
        driver.findElement(Locators.BUTTON_YEAR_SELECT).click();
        driver.findElement(Locators.LIST_YEAR_SELECT).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + "!!!!!!!");
        checkboxConfirmation.click();

    }

    public void clickRequestTourInfoButton(){
        driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO).click();
    }

    public void clickLinkJoinToday(){
        driver.findElement(Locators.LINK_JOIN_TODAY).click();

    }
    public void completeFirstPartOfRegistration2(){
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email2);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password2);
        driver.findElements(Locators.BUTTON_NEXT).get(indexButtonNext).click();

    }

    public void clickButtonVideoBox(){
        WebElement ele = driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX_IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX).click();
    }

    public void clickLinkSupport(){
        driver.findElement(Locators.LINK_SUPPORT).click();
    }



}
