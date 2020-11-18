import org.testng.annotations.Test;

public class JoinTodayTests extends BaseUl {




    @Test
    public void testJoinToday() {
       mainPage.clickLinkJoinToday();
       mainPage.completeJoinTodayRegistration();
    }
}
