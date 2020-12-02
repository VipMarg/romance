package com.romanceabroad.ui;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUl {



    @Test(dataProvider = "Registration2",dataProviderClass = DataProviders.class)
    public void testRegistration2(String email, String nickname, boolean requirement) {
        System.out.println(email);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, Data.password);
        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR).isDisplayed());
        } else {
            mainPage.clickNextButton();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            mainPage.completeSecondPartOfRegistration(nickname, Data.day, Data.month, Data.year, Data.phone, Data.city, Data.location);

        }
    }

        @Test(dataProvider = "Registration",dataProviderClass = DataProviders.class)
        public void testRegistration (String email, String password, String username,
                String day, String month, String year, String phone, String city, String location){
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(email, password);
            mainPage.clickNextButton();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            mainPage.completeSecondPartOfRegistration(username, day, month, year, phone, city, location);

        }

        @Test
        public void testRegistration3 () {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
            mainPage.clickNextButton();
            mainPage.completeSecondPartOfRegistration(Data.username, Data.day, Data.month, Data.year, Data.phone, Data.city, Data.location);
           /*  WebElement checkboxConfirmation= driver.findElement(By.cssSelector("input#confirmation"));
                   Assert.assertTrue(!driver.findElement(com.romanceabroad.ui.Locators.LINK_SEARCH).isSelected(),"Element is not displayed");
                   checkboxConfirmation.click();
*/
        }



}
