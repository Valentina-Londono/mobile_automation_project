package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Login / Sign up Form\")")
    WebElement lblLoginSignUp;

    @AndroidFindBy(uiAutomator = "text(\"Login\").instance(0)")
    WebElement btnLoginForm;

    @AndroidFindBy(uiAutomator = "text(\"Sign up\")")
    WebElement btnSignUpForm;

    @AndroidFindBy(accessibility = "input-email")
    WebElement txtEmailLogin;

    @AndroidFindBy(accessibility = "input-password")
    WebElement txtPasswordLogin;

    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(16)")
    WebElement btnSubmitLogin;

    @AndroidFindBy(accessibility = "input-email")
    WebElement txtEmailSignUp;

    @AndroidFindBy(accessibility = "input-password")
    WebElement txtPasswordSignUp;

    @AndroidFindBy(accessibility = "input-repeat-password")
    WebElement txtConfirmPasswordSignUp;

    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(17)")
    WebElement btnSubmitSignUp;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public void checkLoginScreen() {
        lblLoginSignUp.isDisplayed();
    }
}
