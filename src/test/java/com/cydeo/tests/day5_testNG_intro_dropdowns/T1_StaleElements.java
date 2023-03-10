package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementBrn = driver.findElement(By.xpath("//button[.='Add Element']"));

        Thread.sleep(1000);
        addElementBrn.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        deleteButton.click();

        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementException");
            System.out.println("Element deleted from page");
            System.out.println("deleteButton.isDisplayed() = false");
        }


        driver.quit();
    }


}
