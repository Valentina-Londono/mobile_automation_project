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

    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(16)")
    WebElement btnSubmitLogin;

    @AndroidFindBy(accessibility = "input-email")
    WebElement txtEmail;

    @AndroidFindBy(accessibility = "input-password")
    WebElement txtPassword;

    @AndroidFindBy(accessibility = "input-repeat-password")
    WebElement txtConfirmPasswordSignUp;

    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(17)")
    WebElement btnSubmitSignUp;

    @AndroidFindBy(id = "android:id/alertTitle")
    WebElement lblAlertTitle;

    @AndroidFindBy(id = "android:id/button1")
    WebElement btnAlert;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean checkLoginScreen() {
        return lblLoginSignUp.isDisplayed();
    }

    public void clickBtnLoginForm() {
        btnLoginForm.click();
    }

    public void clickBtnSignUpForm() {
        btnSignUpForm.click();
    }

    public void completeEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void completePassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void completeSignUpConfirmPassword(String confirmPassword) {
        txtConfirmPasswordSignUp.sendKeys(confirmPassword);
    }

    public void clickBtnSubmitSignUp() {
        btnSubmitSignUp.click();
    }

    public void clickBtnSubmitLogin(){
        btnSubmitLogin.click();
    }

    public boolean checkSuccessProcess() {
        return isTheElementVisible(lblAlertTitle, 10);
    }

    public void exitSuccessAlert(){
        btnAlert.click();
    }


}
