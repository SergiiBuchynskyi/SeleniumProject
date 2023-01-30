package com.cydeo.tests.day4_findElements_Checkbox_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_xpath_css_Selectors {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");
        driver.manage().window().maximize();
        //Locate HOME LINK
        // css, class value
        WebElement homeLinkEx1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //css short syntax, class value
        WebElement homeLinkEx2 = driver.findElement(By.cssSelector("a.nav-link"));
        //css using href value
        WebElement homeLinkEx3 = driver.findElement(By.cssSelector("a[href='/']"));


        //"Forgot password" header
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement forgotPassword2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement forgotPassword3 = driver.findElement(By.cssSelector("div.example>h2"));

        //Email label
        WebElement emailLabel1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel2 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailLabel3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        System.out.println("homeLinkEx1.isDisplayed() = " + homeLinkEx1.isDisplayed());
        System.out.println("homeLinkEx1.isDisplayed() = " + homeLinkEx2.isDisplayed());
        System.out.println("homeLinkEx1.isDisplayed() = " + homeLinkEx3.isDisplayed());

        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword2.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword3.isDisplayed());

        System.out.println("emailLabel1.isDisplayed() = " + emailLabel1.isDisplayed());
        System.out.println("emailLabel1.isDisplayed() = " + emailLabel2.isDisplayed());
        System.out.println("emailLabel1.isDisplayed() = " + emailLabel3.isDisplayed());

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.DAYS);
        //driver.quit();
    }

}
