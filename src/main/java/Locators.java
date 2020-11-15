import org.openqa.selenium.By;

public class Locators {

   //Media page
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By DROP_DOWN_LIST_MEDIA_SORT_BY= By.xpath("//*[@id=\"gallery_media_sorter\"]/select");
    public static final By DROP_DOWN_LIST_MEDIA_ADD_PHOTO= By.xpath("//button[@data-media='add_photo']");


 //How it works page"
    public static final By LINK_HOWITWORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Pretty women page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By TITLE_OF_PAGE= By.xpath("//h1");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By TAB_SEARCH_PARAMETERS = By.xpath("//div[@class='search-param-button mb10']");
    public static final By IMAGES= By.xpath("//a[@class='g-pic-border g-rounded']");
    public static final By DROP_DOWN_MAX_AGE= By.cssSelector("select#age_max");
    public static final By DROP_DOWN_MIN_AGE= By.cssSelector("select#age_min");
    public static final By BUTTON_SEARCH= By.xpath("//*[@id=\"main_search_button_user_advanced\"]");

    //Gifts page
    public static final By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");

    // ToutToUkraine page
    public static final By LINK_TOUR_TO_UKRAINE= By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");


    //Blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

   //Sign in page
   public static final By LINK_SIGN_IN= By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");

                                            // Main page
    //Registration page (Join for free now)
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_USERNAME=(By.cssSelector("#nickname"));
    public static final By TEXT_FIELD_PHONE=(By.cssSelector("input[name='data[phone]']"));
    public static final By BUTTON_DAY_SELECT=(By.cssSelector("#daySelect"));
    public static final By BUTTON_MONTH_SELECT=(By.cssSelector("#monthSelect"));
    public static final By BUTTON_YEAR_SELECT=(By.cssSelector("#yearSelect"));
    public static final By LIST_DAY_SELECT=(By.xpath("//li[@data-handler='selectDay']//a[text()='1']"));
    public static final By LIST_MONTH_SELECT=(By.xpath("//li[@data-handler='selectMonth']//a[text()='May']"));
    public static final By LIST_YEAR_SELECT=(By.cssSelector("#yearSelect"));
    public static final By CHECK_BOX_CONFIRMATION=(By.cssSelector("input#confirmation"));

    //Join today page
    public static final By LINK_JOIN_TODAY= By.xpath("//a[text()='JOIN TODAY!']");
    public static final By TEXT_FIELD_EMAIL2= By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD2= By.cssSelector("input#password");
    public static final By BUTTON_NEXT2= By.cssSelector(".btn.btn-primary.btn-block.btn-lg");


                                     //Main page

   public static final By TAB_OF_MAIN_PAGE= By.xpath("//ul[@class='navbar-nav']//li");
   public static final By TITLE_OF_MAIN_PAGE= By.xpath("//div[@class='col-lg-8 mx-auto']//p[@class='text-faded mb-5']");
   public static final By TITLE_OF_MAIN_PAGE2= By.xpath("//h1[@class='text-uppercase']//strong[text()='Ukrainian Girls Dating Site']");
   public static final By TITLE_OF_MAIN_PAGE3= By.xpath("//div[@class='col-lg-12 text-center']//h2[@class='section-heading text-white']");
   public static final By TITLE_OF_MAIN_PAGE4= By.xpath("//div[@class='col-lg-12 text-center']//h3[@class='text-white']");
   public static final By LOGO_OF_SITE_ON_MAIN_PAGE= By.xpath("//div[@class='col-lg-7 footerlg']//img[@src='/img/logo.jpg']");
   public static final By LINK_YOUTUBE= By.xpath("//a[@href='https://www.youtube.com/channel/UCCmXAG1ToSyHymqYzzJcTfQ']//img[@src='/img/youtube-ico.jpg']");
   public static final By LINK_FACEBOOK= By.xpath("//a[@href='https://m.facebook.com/RomanceAbroad/?ref=bookmarks']//img[@src='/img/facebook-ico.jpg']");
   public static final By TAB_PHONE= By.xpath("//span//a[@href='callto:18885997816']");
   public static final By TITLE_GET_IN_TOUCH= By.xpath("//div[@class='col-lg-5']//h2[text()='Get In Touch']");
   public static final By LINK_MAIL_SUPPORT= By.cssSelector("a[href='mailto:support@romanceabroad.com']");
   public static final By BUTTON_REQUEST_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
   public static final By BUTTON_HOME_VIDEO_BOX_IFRAME= By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
   public static final By BUTTON_HOME_VIDEO_BOX= By.xpath("//button[@class='ytp-large-play-button ytp-button']");

}
