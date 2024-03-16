package com.tribe.workshop.march2024;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumWorkshopMarchTests {

	@Test
	public void myFirstTest() throws URISyntaxException, MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setPlatformVersion("13")
                .setAppPackage("com.vodqareactnative")
                .setAppActivity("com.vodqareactnative.MainActivity")
                .setAutomationName("UiAutomator2")
                .setDeviceName("Mi A1");

        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);

        Thread.sleep(5000);
        // get username element
        WebElement usernameElement = driver.findElement(AppiumBy.accessibilityId("username"));
        // clear text
        usernameElement.clear();
        // enter text
        usernameElement.sendKeys("admin");
        // get password element
        WebElement passwordElement = driver.findElement(AppiumBy.accessibilityId("password"));
        // clear text
        passwordElement.clear();
        // enter text
        passwordElement.sendKeys("admin");

        // click on login button
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"LOG IN\")")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
