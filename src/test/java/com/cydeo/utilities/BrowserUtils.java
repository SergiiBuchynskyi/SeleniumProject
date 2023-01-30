package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }


    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expInTitle) {
        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("CurrentUrl = " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actTitle = driver.getTitle();

        Assert.assertTrue(actTitle.contains(expInTitle));
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }



}
