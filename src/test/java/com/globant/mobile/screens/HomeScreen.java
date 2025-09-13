package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(0)")
    WebElement imgHome;

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean checkImgHome(){
        return imgHome.isDisplayed();
    }
}
