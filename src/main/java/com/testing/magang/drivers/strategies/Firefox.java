package com.testing.magang.drivers.strategies;

import com.testing.magang.utils.Regular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", Regular.FIREFOXDRIVER);
        driver = new FirefoxDriver();
        return driver;
    }
}
