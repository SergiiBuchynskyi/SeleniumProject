package com.cydeo.tests.day2_LOCATORS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.click();
        searchBar.sendKeys("Міктор" + Keys.ENTER);

        Thread.sleep(500);

        String expInTitle = "Міктор";
        String actTitle = driver.getTitle();

        if (actTitle.startsWith(expInTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        Thread.sleep(5000);


        driver.quit();

    }
}
