package com.cydeo.tests.day2_LOCATORS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement abTestLink = driver.findElement(By.linkText("NazimTask1/B Testing"));
        abTestLink.click();
        Thread.sleep(1000);

        driver.navigate().back();

        driver.findElement(By.name("test1/B Testing"));

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();
        System.out.println(expectedTitle2.equals(actualTitle2) ? "Passed" : "Failed");



        driver.quit();


    }

}
