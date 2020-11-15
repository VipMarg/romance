import org.testng.Assert;
import org.testng.annotations.Test;

public class HowItWorksTests extends BaseUl {

    String currentUrlHowWeWork;


    @Test
    public void testHowItWorks() {
        driver.findElement(Locators.LINK_HOWITWORKS).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowItWorks);
    }


}
