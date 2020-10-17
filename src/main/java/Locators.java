import org.openqa.selenium.By;

public class Locators {

   //Media page
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");

    //How it works page
    public static final By LINK_HOWITWORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    //Store page
    public static final By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");

    //Support page
    public static final By LINK_SUPPORT= By.cssSelector("a[href='mailto:support@romanceabroad.com']");

    //View page
    public static final By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    //Registration page
    public static final By BUTTON_REGISTRATION = By.cssSelector("#show-registration-block");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_USERNAME=(By.cssSelector("#nickname"));
    public static final By TEXT_FIELD_PHONE=(By.cssSelector("input[name='data[phone]']"));


    //Request tour info
    public static final By BUTTON_REQUEST_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");

    //Sign in page
    public static final By LINK_SIGN_IN= By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");


    //Join today page
    public static final By BUTTON_JOIN_TODAY= By.xpath("//a[text()='JOIN TODAY!']");
    public static final By TEXT_FIELD_JOINEMAIL= By.cssSelector("input#email");
    public static final By TEXT_FIELD_JOINPASSWORD= By.cssSelector("input#password");
    public static final By BUTTON_JOINNEXT= By.cssSelector(".btn.btn-primary.btn-block.btn-lg");


}
