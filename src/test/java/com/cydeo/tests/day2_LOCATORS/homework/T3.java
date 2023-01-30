package com.cydeo.tests.day2_LOCATORS.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {

    public static void main(String[] args) {
        /*
        TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        String expTitle = "Gmail";
        String actTitle = driver.getTitle();

        System.out.println(actTitle.contains(expTitle)? "Passed title verification" : "Failed title verification");

        driver.navigate().back();

        String expTitle1 = "Google";
        String actTitle1 = driver.getTitle();
        System.out.println(actTitle1.contains(expTitle1)? "Passed title verification" : "Failed title verification");

        driver.quit();
    }

}
