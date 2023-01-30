package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle= "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Confirm title");
        }else {
            System.err.println("Title error");
        }
        driver.quit();

    }

}
