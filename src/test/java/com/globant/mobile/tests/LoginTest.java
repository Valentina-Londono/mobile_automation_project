package com.globant.mobile.tests;

import com.globant.mobile.screens.LoginScreen;
import com.globant.mobile.screens.NavigationBarScreen;
import com.globant.mobile.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private NavigationBarScreen navBar;
    private LoginScreen loginScreen;
    private String email = "test@test.com";
    private String password = "12345678";

    /**
     * This method runs before each test.
     * It creates one valid user.
     * The user has email and password.
     */
    @BeforeMethod
    public void createValidUser(){
        navBar = new NavigationBarScreen(driver);
        loginScreen = navBar.clickBtnLoginPage();
        loginScreen.clickBtnSignUpForm();
        loginScreen.completeEmail(email);
        loginScreen.completePassword(password);
        loginScreen.completeSignUpConfirmPassword(password);
        loginScreen.clickBtnSubmitSignUp();
        loginScreen.exitSuccessAlert();
    }

    /**
     * This test checks login is ok.
     * It uses the user created before.
     * It clicks login and checks success message.
     */
    @Test
    public void loginSuccessTest(){
        loginScreen.clickBtnLoginForm();
        loginScreen.clickBtnSubmitLogin();
        Assert.assertTrue(loginScreen.checkSuccessProcess(), "Login is not successful");
        loginScreen.exitSuccessAlert();
    }

}

