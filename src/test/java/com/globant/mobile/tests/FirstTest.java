package com.globant.mobile.tests;

import com.globant.mobile.screens.HomeScreen;
import com.globant.mobile.screens.NavigationBarScreen;
import com.globant.mobile.screens.WebviewScreen;
import com.globant.mobile.utils.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test_01(){
        HomeScreen homeScreen = new HomeScreen(driver);
        NavigationBarScreen navigationBarScreen = new NavigationBarScreen(driver);
        WebviewScreen webviewScreen = navigationBarScreen.clickBtnWebViewPage();
        webviewScreen.checkWebviewScreen();

    }
}
