package com.cydeo.tests.day2_LOCATORS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com/");


        // url verify
        String expectedURL = "cydeo";

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL PASSed");
        }else {
            System.out.println("URL FAILed");
        }

        // title verification
        String expTitle = "Practice";
        String actTitle = driver.getTitle();

        if(expTitle.equals(actTitle)){
            System.out.println("Title PASSed");
        }else {
            System.out.println("Title FAILed");
        }



        Thread.sleep(1000);

        driver.quit();


    }

}
