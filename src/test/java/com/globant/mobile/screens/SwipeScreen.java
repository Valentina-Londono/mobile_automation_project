package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Swipe horizontal\")")
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

    @AndroidFindBy(uiAutomator = "description(\"card\")")
    List<WebElement> visibleCards;

    @AndroidFindBy(uiAutomator = "text(\"You found me!!!\")")
    WebElement lblFoundMe;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean checkSwipeScreen() {
        return lblSwipePage.isDisplayed();
    }

    public void swipeIntoCards() {
        swipeHorizontalRightToLeft();
    }

    public void swipeToFoundMe(){
        swipeVerticallyCenterToUp();
    }

    public boolean checkGithubCard(){
        return checkElementNotVisible(cardGitHub);
    }

    public boolean checkCommunityCard(){
        return checkElementNotVisible(cardCommunity);
    }

    public boolean checkJSCard(){
        return checkElementNotVisible(cardJS);
    }

    public boolean checkCardVideos(){
        return checkElementNotVisible(cardVideos);
    }

    public boolean checkCardExtendable(){
        return checkElementNotVisible(cardExtendable);
    }

    public boolean checkCardCompatible(){
        return checkElementNotVisible(cardCompatible);
    }

    public int countNumberOfCards(){
        return visibleCards.size();
    }

    public boolean checkLblFoundMe(){
        return lblFoundMe.isDisplayed();
    }

}
