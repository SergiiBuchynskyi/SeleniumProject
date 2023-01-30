package com.cydeo.tests.day11_Actions_JS_Executor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalTask {

    @Test
    public void test() {
        Driver.getDriver().get("https://cantunsee.space/");

        //list of answers
        String result = "121122211112221222222212121212212121112121212121211222111";
        String[] arr = result.split("");

        List<String> answer = new ArrayList<>(List.of(arr));

        //System.out.println(answer);

        Actions actions = new Actions(Driver.getDriver());
        //loop and click + enter
        for (String s : answer) {
                actions.sendKeys(Keys.ENTER).perform();
            if (s.equals("1")) {
                WebElement leftElement = Driver.getDriver().findElement(By.xpath("(//div[@class='css-12ogqma']/img)[1]"));
                try {
                    leftElement.click();
                } catch (ElementClickInterceptedException e) {
                }
            } else {
                try {
                    WebElement rightElement = Driver.getDriver().findElement(By.xpath("(//div[@class='css-12ogqma']/img)[2]"));
                    rightElement.click();
                } catch (ElementClickInterceptedException e) {
                }
            }
            actions.sendKeys(Keys.ENTER).perform();
        }
    }
}
