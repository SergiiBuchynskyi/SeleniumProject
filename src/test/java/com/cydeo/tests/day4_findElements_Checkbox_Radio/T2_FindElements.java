package com.cydeo.tests.day4_findElements_Checkbox_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_FindElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("CHromE");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement allLink : allLinks) {
            System.out.println("Text of link = " + allLink.getText());
            System.out.println("HREF = " + allLink.getAttribute("href"));
        }

        driver.quit();
    }

}
