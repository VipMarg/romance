package com.romanceabroad.ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseUiTestWithSauceLabs {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com/";
    MainPage mainPage;
    SearchPage searchPage;
    MediaPage mediaPage;
    ContactUsPage contactUsPage;
    HowItWorksPage howItWorksPage;
    SoftAssert softAssert=new SoftAssert();


    @BeforeMethod
    @Parameters({"browser", "version", "platform"})
    public void setup (String browser, String version, String platform, Method method) throws MalformedURLException {
        Reports.start(method.getName());

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("username", "VipMarg");
        capabilities.setCapability("accessKey", "6d30f7e1-ddd7-49ce-b9eb-1841bceae1c6");
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("platform",platform);
        capabilities.setCapability("version", version);
        capabilities.setCapability("name", method.getName());
        driver=new RemoteWebDriver(
                new URL("http://" + System.getenv("SAUCE_USERNAME") + ":"
                        +System.getenv("SAUCE_ACCESS_KEY")+ "@ondemand.saucelabs.com:80/wd/hub" ),capabilities);

        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver,wait);
        searchPage= new SearchPage(driver,wait);
        mediaPage= new MediaPage(driver,wait);
        contactUsPage=new ContactUsPage(driver,wait);
        howItWorksPage=new HowItWorksPage(driver,wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);


    }
    @AfterMethod(groups= {"admin", "user"})
    public void  tearDown (ITestResult testResult){
        // Local Reports

        if (testResult.getStatus() ==ITestResult.FAILURE){
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();

        // Sauce Labs
        ((JavascriptExecutor)driver).executeScript("sauce:job-result=" +(testResult.isSuccess()? "passed": "failed"));

        driver.quit();

    }


}


