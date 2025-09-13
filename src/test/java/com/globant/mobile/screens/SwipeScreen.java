package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Form components\")")
    WebElement lblSwipePage;

    @AndroidFindBy(uiAutomator = "text(\"\uDB80\uDEA4\")")
    WebElement cardGitHub;

    @AndroidFindBy(uiAutomator = "text(\"\uDB81\uDE11\")")
    WebElement cardCommunity;

    @AndroidFindBy(uiAutomator = "text(\"\uDB80\uDF1E\")")
    WebElement cardJS;

    @AndroidFindBy(uiAutomator = "text(\"\uDB81\uDDC3\")")
    WebElement cardVideos;

    @AndroidFindBy(uiAutomator = "text(\"\uDB80\uDDFB\")")
    WebElement cardExtendable;

    @AndroidFindBy(uiAutomator = "text(\"\uDB82\uDDBE\")")
    WebElement cardCompatible;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public void checkSwipeScreen() {
        lblSwipePage.isDisplayed();
    }
}
