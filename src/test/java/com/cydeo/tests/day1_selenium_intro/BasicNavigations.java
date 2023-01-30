package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[ ] args) throws InterruptedException {

        //1 - setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2 - Create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //3- go to https://www.tesla.com/
        driver.get("https://www.tesla.com/");

        //sleep
        Thread.sleep(500);

        // go to navigate back

        driver.navigate().back();

        //sleep
        Thread.sleep(500);


        driver.navigate().forward();

        Thread.sleep(500);

        driver.navigate().refresh();

        Thread.sleep(500);

        driver.navigate().to("https://www.youtube.com/");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(500);

        driver.close();
        driver.quit();


    }

}
