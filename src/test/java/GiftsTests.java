import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GiftsTests  {

    String currentUrlGifts;

    /*@Test
    public void testStore() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);

    }*/
    @DataProvider(name="Gifts")
    public static Object[][]testGifts()throws Exception{
        ArrayList<Object[]> out= new ArrayList<>();
        Files.readAllLines(Paths.get("Gifts.csv")).stream().forEach(s ->{
            String []data= s.split(",");
            out.add(new Object[]{data[0]});

        });
        return out.toArray(new Object[out.size()][]);

    }

    @Test(dataProvider = "Gifts")
    public void testGifts(String Flower) {
        System.out.println(Flower);
       /* driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.completeSecondPartOfRegistration(Data.phone, Data.username, Data.month, Data.day, Data.year, Data.city, Data.location);*/


    }



}