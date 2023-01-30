package com.cydeo.tests.day2_LOCATORS.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_Facebook {

    public static void main(String[] args) throws InterruptedException {

/*
TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - Log In or Sign Up”

TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
 */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));

        email.sendKeys("Incorrect");
        password.sendKeys("Incorrect" + Keys.ENTER);

        String expTitle = "Увійти у Facebook";
        String actTitle = driver.getTitle();

        System.out.println(expTitle.equals(actTitle)? "Passed": "Failed");


        Thread.sleep(15000);

        //driver.quit();


    }

}
