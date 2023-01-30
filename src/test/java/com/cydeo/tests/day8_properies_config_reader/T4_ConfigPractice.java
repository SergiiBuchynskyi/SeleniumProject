package com.cydeo.tests.day8_properies_config_reader;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T4_ConfigPractice {

    /*
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
*/


    @Test
    public void google_search_test() {
        Driver.getDriver().get("https://google.com");
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        String expTitle = "apple - Google Search";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actTitle, expTitle);
    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver();

        }
    }



