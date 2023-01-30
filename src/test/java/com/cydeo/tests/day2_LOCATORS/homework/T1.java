package com.cydeo.tests.day2_LOCATORS.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {

    public static void main(String[] args) {
        /*
        TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query"));
        searchBar.sendKeys("wooden spoon" + Keys.ENTER);

        String expTitle = "Wooden spoon | Etsy";
        String actTitle = driver.getTitle();
        System.out.println(expTitle.equals(actTitle) ? "Passed" : "Failed");

        driver.quit();

    }

}
