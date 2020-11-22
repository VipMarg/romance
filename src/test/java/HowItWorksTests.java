import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> linksOfArticles= howItWorksPage.collectAllLinksOfArticles();
        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link= linksOfArticles.get(i);
            nameOfArticle= link.getText();
            if(nameOfArticle.contains("How it works")){
                continue;
            }
            if(nameOfArticle.contains("Kharkov dating agency")){
                continue;
            }
            if(nameOfArticle.contains("Kiev dating agency")){
                continue;
            }
            if(nameOfArticle.contains("Odessa dating agency")){
                continue;
            }
            if(nameOfArticle.contains("Mail order girls")){
                continue;
            }
            if(nameOfArticle.contains("Beautiful urkainian girls")){
                continue;
            }
            if(nameOfArticle.contains("Real Ukrainian brides")){
                continue;
            }
            if(nameOfArticle.contains("Eastern European women")){
                continue;
            }
            if(nameOfArticle.contains("Marriage agency in Ukraine")){
                continue;
            }
            if(nameOfArticle.contains("Kiev dating site")){
                continue;
            }
            if(nameOfArticle.contains("Find Ukrainian girlfriend")){
                continue;
            }
            if(nameOfArticle.contains("Slavic women for marriage")){
                continue;
            }
            if(nameOfArticle.contains("How to marry Ukrainian lady")){
                continue;
            }
            if(nameOfArticle.contains("Free Ukrainian dating site")){
                continue;
            }
            if(nameOfArticle.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){
                continue;
            }
            if(nameOfArticle.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman?")){
                continue;
            }
            link.click();
            titleOfArticle= howItWorksPage.getAnyTitle();
            Assert.assertEquals(nameOfArticle,titleOfArticle);
            linksOfArticles= howItWorksPage.collectAllLinksOfArticles();
        }

    }

}
