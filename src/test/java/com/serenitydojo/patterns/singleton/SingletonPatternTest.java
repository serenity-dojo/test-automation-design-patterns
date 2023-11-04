package com.serenitydojo.patterns.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

public class SingletonPatternTest {

    @DisplayName("When running several webdriver tests in parallel")
    @ParameterizedTest
    @ValueSource(strings = {"https://www.wikipedia.com","https://www.google.com","https://www.duckduckgo.com"})
    @Execution(ExecutionMode.CONCURRENT)
    void openANewPage(String url) {
        WebDriver driver = WebDriverManager.getDriver();

        driver.get(url);

        Assertions.assertThat(driver.getTitle()).isNotBlank();

        WebDriverManager.quitDriver();
    }
}
