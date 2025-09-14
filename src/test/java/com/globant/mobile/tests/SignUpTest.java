package com.globant.mobile.tests;

import com.globant.mobile.screens.LoginScreen;
import com.globant.mobile.screens.NavigationBarScreen;
import com.globant.mobile.utils.BaseTest;
import com.globant.mobile.utils.DataUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    NavigationBarScreen navigationBarScreen;
    LoginScreen loginScreen;

    /**
     * This method opens the login screen.
     * It runs before each test.
     */
    @BeforeMethod
    public void displayLoginScreen() {
        navigationBarScreen = new NavigationBarScreen(driver);
        loginScreen = navigationBarScreen.clickBtnLoginPage();
    }

    /**
     * This test makes a new sign up.
     * It writes email and password.
     * It checks that sign up is successful.
     */
    @Test
    public void loginTest(){
        Assert.assertTrue(loginScreen.checkLoginScreen(),  "Login screen is not displayed");
        loginScreen.clickBtnSignUpForm();
        String email = DataUtils.generateRandomEmail();
        loginScreen.completeEmail(email);
        loginScreen.completePassword("12345678");
        loginScreen.completeSignUpConfirmPassword("12345678");
        loginScreen.clickBtnSubmitSignUp();
        Assert.assertTrue(loginScreen.checkSuccessProcess(), "Sign up is not successful");
    }
}

