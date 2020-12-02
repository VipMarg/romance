package com.romanceabroad.ui;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUl {

    String currentUrlBlog;

    @Test
    public void testBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);

    }


}
