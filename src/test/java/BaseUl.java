
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;


public class BaseUl {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com/";
    MainPage mainPage;
    SearchPage searchPage;
    MediaPage mediaPage;
    SoftAssert softAssert=new SoftAssert();


    @BeforeMethod


        @Parameters("browser")

        public void setup(@Optional("chrome") String browser, Method method){

            // Check if parameter passed from TestNG is 'firefox'

            if (browser.equalsIgnoreCase("firefox")) {
                // Create firefox instance
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                driver = new FirefoxDriver();

            }
            // Check if parameter passed as 'chrome'
            else if (browser.equalsIgnoreCase("chrome")) {
                // Set path to chromedriver.exe
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                // Create chrome instance
                driver = new ChromeDriver();
                driver.get("chrome://settings/clearBrowserData");

            } else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().deleteAllCookies();

            } else {
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("chrome://settings/clearBrowserData");

            }

        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver,wait);
        searchPage= new SearchPage(driver,wait);
        mediaPage= new MediaPage(driver,wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }


    @AfterMethod
    public void afterActions () {

        //driver.quit();
    }

    public void getDropDownListByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void getDropDownListByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }

}


