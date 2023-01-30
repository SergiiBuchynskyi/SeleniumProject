package com.cydeo.tests.day11_Actions_JS_Executor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Practice {

    @Test
    public void task4_and_task5(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).pause(2000).perform();

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Driver.quitDriver();

    }

    @Test
    public void test2(){
        System.out.println(Driver.getDriver().hashCode());
        Driver.getDriver().get("https://practice.cydeo.com/");
        System.out.println(Driver.getDriver().hashCode());

    }

}
