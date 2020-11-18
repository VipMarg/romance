import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HowItWorksTests extends BaseUl {

    String currentUrlHowWeWork;
    String nameOfArticle;
    String titleOfArticle;


    @Test
    public void testHowItWorks() {
        driver.findElement(Locators.LINK_HOWITWORKS).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowItWorks);
    }
    @Test
    public void testArticlesAndTitles(){
        mainPage.clickLinkHowItWorks();
        List<WebElement> linksOfArticles= howItWorksPage.collectAllLinksOfArticles();
        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link= linksOfArticles.get(i);
            nameOfArticle= link.getText();
            link.click();
            titleOfArticle= howItWorksPage.getAnyTitle();
            Assert.assertEquals(nameOfArticle,titleOfArticle);
            linksOfArticles= howItWorksPage.collectAllLinksOfArticles();
        }

    }


}
