package com.cydeo.tests.day2_LOCATORS.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header = driver.findElement(By.className("page-header"));

        String expHeader = "Log in to ZeroBank";



        String actHeader = header.getText();
        System.out.println(actHeader.equals(expHeader)? "Passed" : "Failed");

        driver.quit();


    }

}
