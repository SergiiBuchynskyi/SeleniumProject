package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NazimTask {

    @Test
    public void Nazim_test(){

        Driver.getDriver().get("https://todomvc.com/");


        WebElement elementJS = Driver.getDriver().findElement(By.xpath("//div[.='JavaScript']"));
        WebElement elementPolymer = Driver.getDriver().findElement(By.xpath("//a[.='Polymer']"));
        elementJS.click();
        elementPolymer.click();


        //Enter To Do
        WebElement inputToDo = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        inputToDo.sendKeys("Milk" + Keys.ENTER);
        inputToDo.sendKeys("Butter" + Keys.ENTER);


        WebElement secondItemText = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[3]"));

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(secondItemText).perform();
        actions.keyDown(Keys.CONTROL)
                .sendKeys(Keys.chord(Keys.BACK_SPACE))
                .keyUp(Keys.CONTROL)
                .sendKeys("Edited Butter")
                .perform();

        BrowserUtils.sleep(2);

        Driver.quitDriver();
    }
}
