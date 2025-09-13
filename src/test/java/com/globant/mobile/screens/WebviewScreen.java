package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebviewScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Next-gen browser and mobile automation test framework for Node.js\")")
    WebElement webViewContainer;

    public WebviewScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean checkWebviewScreen() {
        wait.waitForElementVisible(webViewContainer);
        return webViewContainer.isDisplayed();
    }
}
