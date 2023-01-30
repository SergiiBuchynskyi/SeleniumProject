package com.cydeo.tests.day6_WindowHandling;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test() {
        driver.get("https://www.amazon.com/");


        ((JavascriptExecutor)driver).executeScript("window.open('https://www.facebook.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://www.etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com','_blank');");

        Set<String> allWindowsHandles= driver.getWindowHandles();
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }
        }
        String actTitle = driver.getTitle();
        String expInTitle = "Etsy";
        Assert.assertTrue(actTitle.contains(expInTitle));
    }
}
