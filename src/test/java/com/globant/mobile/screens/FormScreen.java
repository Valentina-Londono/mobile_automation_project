package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Form components\")")
    WebElement lblFormPage;

    public FormScreen(AppiumDriver driver) {
        super(driver);
    }

    public void checkFormScreen() {
        lblFormPage.isDisplayed();
    }
}
