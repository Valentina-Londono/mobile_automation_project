package com.globant.mobile.utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseScreen {

    protected AppiumDriver driver;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
    }
}
