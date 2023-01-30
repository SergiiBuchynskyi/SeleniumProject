package com.cydeo.tests.day11_Actions_JS_Executor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DmytroTask {

    @Test
    public void test() {
        Driver.getDriver().get("https://practice.cydeo.com/");
        //WebElement home = Driver.getDriver().findElement(By.linkText("CYDEO"));
        //home.click();
        //BrowserUtils.sleep(1);
        //Driver.quitDriver();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());


        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            //js.executeScript("window.scrollBy(0,750)");
            System.out.println(js.executeScript("Element.scrollTop"));

/*
            try {
                actions.moveToElement(home);
            }catch (Exception e){
                System.out.println("is not displayed");
            }



        }

*/
        }

    }
}
