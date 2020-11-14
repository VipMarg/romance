import org.testng.Assert;
import org.testng.annotations.Test;



public class TourToUkraineTests extends BaseUl {

        String currentUrl;
        int indexLinkToutToUkraine = 1;

        @Test
        public void testTourToUkraine() {
            driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkToutToUkraine).click();
            currentUrl = driver.getCurrentUrl();
            System.out.println(currentUrl);
            Assert.assertEquals(currentUrl, Data.expectedUrlTourToUkraine);

        }


    }






