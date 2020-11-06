import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JoinTodayTests extends BaseUl {




    @Test
    public void testJoinToday() {
       mainPage.clickLinkJoinToday();
       mainPage.completeFirstPartOfRegistration2();
    }
}
