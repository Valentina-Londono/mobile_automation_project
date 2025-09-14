package com.globant.mobile.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeMethod
    public void setUp(){
        this.driver = createDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    /**
     * Create a new Appium driver with options.
     * @return AppiumDriver
     */
    public AppiumDriver createDriver(){
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp("C:\\Users\\valentina.londono\\Documents\\QC Studio\\Mobile Automatization\\android.wdio.native.app.v1.0.8.apk")
                .setDeviceName("emulator-5554")
                .setPlatformVersion("16")
                .setAppActivity(".MainActivity");

        try {
            AppiumDriver driver1 = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);

            driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            return driver1;

        } catch (MalformedURLException e) {

            throw new RuntimeException(e);

        }
    }
}
