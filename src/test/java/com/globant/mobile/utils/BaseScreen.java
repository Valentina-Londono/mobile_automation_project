package com.globant.mobile.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseScreen {

    protected AppiumDriver driver;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /**
     * Wait for an element to check if is visible
     * @param element WebElement for wait
     * @param seconds Max seconds to wait the element
     * @return boolean
     */

    public boolean isTheElementVisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        try {
            WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
            return element1 != null;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    /**
     * Do a swipe from right to left.
     * It starts from center of screen.
     */
    public void swipeHorizontalRightToLeft() {
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        int centerXStart = width / 2;
        int centerY = (int) (height * 0.7);

        int centerXEnd = (int) (width * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerXStart, centerY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(125)))
                .addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), centerXEnd, centerY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(sequence));
    }

    /**
     * Do a swipe from center to up.
     * It is used to scroll the screen.
     */
    public void swipeVerticallyCenterToUp() {
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        int centerX = width / 2;
        int startY = (int) (height * 0.5);
        int endY = (int) (height * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(125)))
                .addAction(finger.createPointerMove(Duration.ofMillis(150), PointerInput.Origin.viewport(), centerX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(sequence));
    }

    /**
     * Check if an element is not visible.
     * @param element WebElement to check
     * @return false if element is not on screen
     */
    public boolean checkElementNotVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
