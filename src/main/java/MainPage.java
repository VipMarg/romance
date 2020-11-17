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
        //driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        performClick(Locators.BUTTON_REGISTRATION);
    }
    public void completeFirstPartOfRegistration(String email, String password){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
    }
    public void completeSecondPartOfRegistration(String username, String phone, String month,
                                                 String day, String year, String location, String city){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(username);
        driver.findElement(Locators.LISTS_DAYS_SELECT).click();
        clickValueOfLists(Locators.LIST_VALUE_DAY, day);
        driver.findElement(Locators.LISTS_MONTHS_SELECT).click();
        clickValueOfLists(Locators.LIST_VALUE_MONTH, month);
        driver.findElement(Locators.LISTS_YEARS_SELECT).click();
        clickValueOfLists(Locators.LIST_VALUE_YEAR, year);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);
        driver.findElement(Locators.CHECK_BOX_CONFIRMATION).click();
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
        clickValueOfLists(Locators.LIST_VALUE_LOCATION,location);
    }


    public void clickRequestTourInfoButton(){
        driver.findElement(Locators.BUTTON_REQUEST_TOUR_INFO).click();
    }

    public void clickLinkJoinToday(){
        driver.findElement(Locators.LINK_JOIN_TODAY).click();

    }
    public void completeFirstPartOfRegistration2(){
        driver.findElement(Locators.TEXT_FIELD_EMAIL2).sendKeys(Data.email2);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD2).sendKeys(Data.password2);
        driver.findElements(Locators.BUTTON_NEXT2).get(indexButtonNext).click();

    }

    public void clickButtonVideoBox(){
        WebElement ele = driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX_IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_HOME_VIDEO_BOX).click();
    }

    public void clickLinkMailSupport(){
        driver.findElement(Locators.LINK_MAIL_SUPPORT).click();
    }





}
