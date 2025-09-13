package com.globant.mobile.tests;

import com.globant.mobile.screens.LoginScreen;
import com.globant.mobile.screens.NavigationBarScreen;
import com.globant.mobile.utils.BaseTest;
import com.globant.mobile.utils.DataUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        NavigationBarScreen navigationBarScreen = new NavigationBarScreen(driver);

        LoginScreen loginScreen = navigationBarScreen.clickBtnLoginPage();
        Assert.assertTrue(loginScreen.checkLoginScreen(),  "Login screen is not displayed");
        loginScreen.clickBtnSignUpForm();
        String email = DataUtils.generateRandomEmail();
        loginScreen.completeSignUpEmail(email);
        loginScreen.completeSignUpPassword("12345678");
        loginScreen.completeSignUpConfirmPassword("12345678");
        loginScreen.clickBtnSubmitSignUp();
        loginScreen.checkSuccessSignUp();
    }
}
