package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    By btnHomeBy = new AppiumBy.ByAndroidUIAutomator("text(\"\uDB81\uDEA1\")");
    WebElement btnHome = driver.findElement(btnHomeBy);

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public void clickHomeBtn(){
        btnHome.click();
    }
}
