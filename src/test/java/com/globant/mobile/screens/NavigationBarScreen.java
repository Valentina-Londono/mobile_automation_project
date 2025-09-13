package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavigationBarScreen extends BaseScreen {

    @AndroidFindBy(accessibility = "Home")
    WebElement btnHomePage;

    @AndroidFindBy(accessibility = "Webview")
    WebElement btnWebViewPage;

    @AndroidFindBy(accessibility = "Login")
    WebElement btnLoginPage;

    @AndroidFindBy(accessibility = "Forms")
    WebElement btnFormsPage;

    @AndroidFindBy(accessibility = "Swipe")
    WebElement btnSwipePage;

    @AndroidFindBy(accessibility = "Drag")
    WebElement btnDragPage;

    public NavigationBarScreen(AppiumDriver driver) {
        super(driver);
    }

    public HomeScreen clickBtnHomePage(){
        btnHomePage.click();
        return new HomeScreen(driver);
    }

    public WebviewScreen clickBtnWebViewPage(){
        btnWebViewPage.click();
        return new WebviewScreen(driver);
    }

    public LoginScreen clickBtnLoginPage(){
        btnLoginPage.click();
        return new LoginScreen(driver);
    }

    public FormScreen clickBtnFormsPage(){
        btnFormsPage.click();
        return new FormScreen(driver);
    }

    public SwipeScreen clickBtnSwipePage(){
        btnSwipePage.click();
        return new SwipeScreen(driver);
    }

    public DragScreen clickBtnDragPage(){
        btnDragPage.click();
        return new DragScreen(driver);
    }
}
