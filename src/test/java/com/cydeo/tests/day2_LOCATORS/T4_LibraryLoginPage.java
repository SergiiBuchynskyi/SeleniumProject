package com.cydeo.tests.day2_LOCATORS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("Student");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("password");

        WebElement signInButton = driver.findElement(By.className("button"));
        signInButton.click();
        System.out.println(signInButton.getText());
        System.out.println(signInButton.getAttribute("button"));


        Thread.sleep(2000);




    }
}
