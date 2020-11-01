import org.testng.annotations.Test;

public class RegistrationTests extends BaseUl {

    @Test
    public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();


    }
}
