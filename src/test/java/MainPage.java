import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrl;
    String expectedUrlHowItWorks="https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlSearch="https://romanceabroad.com/users/search";
    String expectedUrlMedia="https://romanceabroad.com/media/index";
    String expectedUrlStore="https://romanceabroad.com/store/category-sweets";
    String expectedUrlView="https://romanceabroad.com/content/view/blog";
    By LINK_HowItWorks = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_Search = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_Media = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By LINK_Store = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_View = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN= By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By LINK_SUPPORT= By.cssSelector("a[href='mailto:support@romanceabroad.com']");
    By BUTTON_REGISTRATION = By.cssSelector("#show-registration-block");
    By BUTTON_REQUEST_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    By BUTTON_JOIN_TODAY= By.xpath("//a[text()='JOIN TODAY!']");
    int indexLinkSignIn=0;
    int indexButtonNext=1;



    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testHowItWorks (){
        driver.findElement(LINK_HowItWorks).click();
        currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,expectedUrlHowItWorks);
    }
    @Test
    public void testSearch(){
        driver.findElement(LINK_Search).click();
        currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,expectedUrlSearch);
    }
    @Test
    public void testMedia (){
        driver.findElement(LINK_Media).click();
        currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,expectedUrlMedia);

    }
    @Test
    public void testStore (){
        driver.findElement(LINK_Store).click();
        currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,expectedUrlStore);

    }

    @Test
    public void testView (){
        driver.findElement(LINK_View).click();
        currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,expectedUrlView);

    }
    @Test
    public void testSign_In (){
        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();

    }

    @Test
    public void testRegistration (){
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("11@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("11@gmail.com");
        driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();

    }

    @Test
    public void testRequestTourInfo (){
        driver.findElement(BUTTON_REQUEST_TOUR_INFO).click();

    }
    @Test
    public void testJoinToday (){
        driver.findElement(BUTTON_JOIN_TODAY).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("11@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("11@gmail.com");
        driver.findElements(By.cssSelector(".btn.btn-primary.btn-block.btn-lg")).get(indexButtonNext).click();
    }

    @Test
    public void testSupport (){
        driver.findElement(LINK_SUPPORT).click();

    }

    @AfterMethod
    public void afterActions () {

       driver.quit();
    }

}