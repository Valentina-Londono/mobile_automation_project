package com.globant.mobile.tests;

import com.globant.mobile.screens.*;
import com.globant.mobile.utils.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test_01(){
        HomeScreen homeScreen = new HomeScreen(driver);
        NavigationBarScreen navigationBarScreen = new NavigationBarScreen(driver);

        WebviewScreen webviewScreen = navigationBarScreen.clickBtnWebViewPage();
        Assert.assertTrue(webviewScreen.checkWebviewScreen(), "Webview screen is not displayed");

        LoginScreen loginScreen = navigationBarScreen.clickBtnLoginPage();
        Assert.assertTrue(loginScreen.checkLoginScreen(), "Login screen is not displayed");

        FormScreen formScreen = navigationBarScreen.clickBtnFormsPage();
        Assert.assertTrue(formScreen.checkFormScreen(), "Form screen is not displayed");

        SwipeScreen swipeScreen = navigationBarScreen.clickBtnSwipePage();
        Assert.assertTrue(swipeScreen.checkSwipeScreen(), "Swipe screen is not displayed");

        DragScreen dragScreen = navigationBarScreen.clickBtnDragPage();
        Assert.assertTrue(dragScreen.checkDragScreen());
    }
}
