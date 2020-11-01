import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TourToUkraineTests extends BaseUl {

        String currentUrl;
        int indexLinkToutToUkraine = 1;

        @Test
        public void testTourToUkraine() {
            driver.findElements(Locators.LinkToutToUkraine).get(indexLinkToutToUkraine).click();
            currentUrl = driver.getCurrentUrl();
            System.out.println(currentUrl);
            Assert.assertEquals(currentUrl, Data.expectedUrlTourToUkraine);

        }


    }






