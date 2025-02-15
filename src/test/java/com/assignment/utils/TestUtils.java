package com.assignment.utils;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class TestUtils {

    public static void maximizeWindow(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void setImplicitWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
