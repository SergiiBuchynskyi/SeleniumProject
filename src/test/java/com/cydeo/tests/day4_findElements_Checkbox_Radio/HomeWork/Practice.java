package com.cydeo.tests.day4_findElements_Checkbox_Radio.HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test1(){
        //<a class="nav-link" href="/">Home</a>
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement home1 = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //WebElement home2 = driver.findElement(By.cssSelector("//a[@class='nav-link']"));

        //<h2>Forgot Password</h2>
        WebElement forgPasp1 = driver.findElement(By.xpath("//h2"));
        //WebElement forgPasp2 = driver.findElement(By.cssSelector("//a[@class='nav-link']"));

        //<input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="">
        WebElement emailInp1 = driver.findElement(By.xpath("//input[@name='email']"));
        //WebElement emailInp2   = driver.findElement(By.cssSelector("//a[@class='nav-link']"));

        //<label for="email">E-mail</label>
        WebElement emailText1 = driver.findElement(By.xpath("//label[@for='email']"));
        //WebElement emailText2   = driver.findElement(By.cssSelector("//a[@class='nav-link']"));



    }

}
