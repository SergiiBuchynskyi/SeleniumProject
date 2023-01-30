package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    // JS to open window -   ((JavascriptExecutor)driver).executeScript("window.open('https://www.facebook.com','_blank');");


    public static WebDriver getDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "opera":
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                System.out.println("Given browser doesn't exist/or is not currently supported");
                System.out.println("Driver = null");
                return null;
        }

    }    public static void getDriver(String browser, String url) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                new ChromeDriver().get(url);
            case "opera":
                WebDriverManager.operadriver().setup();
                new OperaDriver().get(url);
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                new FirefoxDriver().get(url);
            default:
                System.out.println("Given browser doesn't exist/or is not currently supported");
                System.out.println("Driver = null");

        }


    }

}
