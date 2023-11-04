package com.serenitydojo.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Thread-local WebDriver instance
 */
public class WebDriverManager {

    private static final ThreadLocal<WebDriver> THREAD_LOCAL_DRIVER = ThreadLocal.withInitial(() -> {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Start browser maximized
        options.addArguments("--ignore-certificate-errors"); // Ignore certificate errors
        return new ChromeDriver(options);
    });

    public static WebDriver getDriver() {
        return THREAD_LOCAL_DRIVER.get();
    }

    public static void quitDriver() {
        THREAD_LOCAL_DRIVER.get().quit();
        THREAD_LOCAL_DRIVER.remove();
    }

    private WebDriverManager() {}
}
