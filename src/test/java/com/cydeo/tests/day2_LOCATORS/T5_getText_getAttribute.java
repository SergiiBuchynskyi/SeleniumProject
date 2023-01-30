package com.cydeo.tests.day2_LOCATORS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification passed");
        }else {
            System.out.println("Header text verification failed");
        }

        //first name box
        WebElement firstNameBox = driver.findElement(By.name("firstname"));
        String expPlaceHolder = "first name";
        String actPlaceHolder = firstNameBox.getAttribute("placeholder");

        if (actPlaceHolder.equals(expPlaceHolder)){
            System.out.println("Header text verification passed");
        }else {
            System.out.println("Header text verification failed");
        }
        driver.quit();


    }

}
