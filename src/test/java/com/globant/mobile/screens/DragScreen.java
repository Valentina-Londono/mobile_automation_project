package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"\uDB82\uDDBE\")")
    WebElement lblDragPage;

    public DragScreen(AppiumDriver driver) {
        super(driver);
    }

    public void checkDragScreen() {
        lblDragPage.isDisplayed();
    }
}
