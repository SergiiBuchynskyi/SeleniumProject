package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {

        // Create and open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // open page
        driver.get("https://login1.nextbasecrm.com");
        driver.manage().window().maximize();
        // Specify elements
        WebElement login = driver.findElement(By.className("login-inp"));
        login.sendKeys("incorrect");
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        // click Login Button
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();
        //assign errorMessage
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        // compare actual and expected result
        String expErrorMessage = "Incorrect login or password";
        String actErrorMessage = errorMessage.getText();

        System.out.println(actErrorMessage.equals(expErrorMessage) ? "Pass" : "Failed");


    }

}
