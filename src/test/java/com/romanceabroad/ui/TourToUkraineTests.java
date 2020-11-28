package com.romanceabroad.ui;

import com.romanceabroad.ui.Data;
import com.romanceabroad.ui.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TourToUkraineTests extends BaseUl {

        String currentUrlTour;
        int indexLinkToutToUkraine = 1;

        @Test
        public void testTourToUkraine() {
            driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkToutToUkraine).click();
            currentUrlTour = driver.getCurrentUrl();
            System.out.println(currentUrlTour);
            Assert.assertEquals(currentUrlTour, Data.expectedUrlTourToUkraine);

        }


    }






