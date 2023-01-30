package com.cydeo.tests.day4_findElements_Checkbox_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) throws InterruptedException {
        //1. Open brow
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        //2. conf checkbox #1 is not selected
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //3. conf checkbox #2 is not selected
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //4. click #1 to select
        Thread.sleep(1000);
        checkbox1.click();
        //5. click #2 to not select
        Thread.sleep(1000);

        checkbox2.click();
        Thread.sleep(1000);


        //6. confirm #1
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //7. confirm #2
        System.out.println("checkbox1.isSelected() = " + checkbox2.isSelected());
        driver.quit();



    }

}
