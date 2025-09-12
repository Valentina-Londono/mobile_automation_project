package com.globant.mobile.tests;

import com.globant.mobile.screens.HomeScreen;
import com.globant.mobile.utils.BaseTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test_01(){
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.clickHomeBtn();
    }
}
