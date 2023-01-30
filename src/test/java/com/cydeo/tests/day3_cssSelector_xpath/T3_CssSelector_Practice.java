package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_CssSelector_Practice {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com");

        //verify log in button
        String expLogInButton = "Log In";
        WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        String actLogInButton = signInButton.getAttribute("value");
        //String actLogInButton = signInButton.getAttribute("value");
        //String actLogInButton = signInButton.getAttribute("value");
        //String actLogInButton = signInButton.getAttribute("value");
        System.out.println(expLogInButton);
        System.out.println(actLogInButton);

        System.out.println(expLogInButton.equals(actLogInButton)?
                "Log In button text Passed"
                : "Log In button text Failed");

        driver.quit();


    }
}
