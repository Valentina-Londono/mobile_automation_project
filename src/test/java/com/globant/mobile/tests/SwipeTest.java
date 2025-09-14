package com.globant.mobile.tests;

import com.globant.mobile.screens.NavigationBarScreen;
import com.globant.mobile.screens.SwipeScreen;
import com.globant.mobile.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    public SwipeScreen swipeScreen;
    private NavigationBarScreen navBar;

    /**
     * This method goes to swipe screen.
     * It runs before each test.
     */
    @BeforeMethod
    public void enterToSwipeScreen() {
        navBar = new NavigationBarScreen(driver);
        swipeScreen = navBar.clickBtnSwipePage();
    }

    /**
     * This test makes swipe on cards.
     * It checks that old cards are not visible.
     * It checks that only one card is on screen.
     * It also checks the "Found Me" label.
     */
    @Test
    public void swipeTest() {
        Assert.assertTrue(swipeScreen.checkSwipeScreen());
        swipeScreen.swipeIntoCards();
        Assert.assertFalse(swipeScreen.checkGithubCard());
        swipeScreen.swipeIntoCards();
        Assert.assertFalse(swipeScreen.checkCommunityCard());
        swipeScreen.swipeIntoCards();
        Assert.assertFalse(swipeScreen.checkJSCard());
        swipeScreen.swipeIntoCards();
        Assert.assertFalse(swipeScreen.checkCardVideos());
        swipeScreen.swipeIntoCards();
        Assert.assertFalse(swipeScreen.checkCardExtendable());
        Assert.assertEquals(swipeScreen.countNumberOfCards(), 1);

        swipeScreen.swipeToFoundMe();
        Assert.assertTrue(swipeScreen.checkLblFoundMe());
    }
}

