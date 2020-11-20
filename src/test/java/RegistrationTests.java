import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUl {

    @DataProvider(name="Registration")
    public static Object[][]testRegistration()throws Exception{
        ArrayList<Object[]> out= new ArrayList<>();
        Files.readAllLines(Paths.get("Registration.csv")).stream().forEach(s ->{
            String []data= s.split(",");
            out.add(new Object[]{data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]});


        });
        return out.toArray(new Object[out.size()][]);

    }

    @Test
    public void testRegistration2() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.completeSecondPartOfRegistration(Data.phone, Data.username,Data.month, Data.day, Data.year, Data.city,Data.location);
       // WebElement checkboxConfirmation= driver.findElement(By.cssSelector("input#confirmation"));
        //        Assert.assertTrue(!driver.findElement(Locators.LINK_SEARCH).isSelected(),"Element is not displayed");
        //        checkboxConfirmation.click();

    }
    @Test(dataProvider = "Registration")
    public void testRegistration3(String email,String password,String username,String phone,
                                  String day, String month,String year, String city, String location){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email,password);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.completeSecondPartOfRegistration(username,phone,day,month,year,city,location);


    }
}
