package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        // WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        List<WebElement> sportRadioBtns = driver.findElements(By.name("sport"));

        for (WebElement each : sportRadioBtns) {
            String eachID = each.getAttribute("id");
            System.out.println("eachID = " + eachID);
            if (eachID.toLowerCase().equals("hockey")){
                each.click();
                System.out.println("Hockey is selected " + each.isSelected());
                break;
            }

        }

clickAndVerifyRadioButton(driver, "sport", "hockey");
clickAndVerifyRadioButton(driver, "sport", "football");
clickAndVerifyRadioButton(driver, "sport", "basketball");


    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> sportRadioBtns = driver.findElements(By.name(nameAttribute));
        for (WebElement each : sportRadioBtns) {
            String eachID = each.getAttribute("id");
           if (eachID.equals(idValue)){
                each.click();
                System.out.println(eachID + " is selected " + each.isSelected());
                break;
            }

        }

    }

}
