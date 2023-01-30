package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_Practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        //WebElement resetPasswordButton = driver.findElement(By.xpath("//button[@class=‘login-btn’]));



                String actResButton = resetPasswordButton.getText();
                String expResButton = "Reset password";

        System.out.println(actResButton);
        System.out.println(expResButton);
        System.out.println(actResButton.equals(expResButton)? "Button text test Passed": "Button text test Failed");




    }

}
