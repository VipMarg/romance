import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUl {

    String currentUrlGifts;

    @Test
    public void testStore() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);

    }
}
