package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {

    public static WebDriver driver;
    public static WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));


}
