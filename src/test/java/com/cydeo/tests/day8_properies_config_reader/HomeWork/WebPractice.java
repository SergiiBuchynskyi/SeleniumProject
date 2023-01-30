package com.cydeo.tests.day8_properies_config_reader.HomeWork;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebPractice {

    public static WebDriver driver;
    @BeforeMethod
    public static void setupMethod(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        }
        @Test
    public static void test1(){
        driver.get("https://practice.cydeo.com/web-tables");
            WebElement bob = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//td[.='Bob Martin']"));
            String actBob = bob.getText();
            String expBob = "Bob Martin";

            Assert.assertEquals(actBob, expBob);
            String expBobDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//td[.='Bob Martin']/following-sibling::td[3]")).getText();
            String actBobDate = "12/31/2021";
    }




}
