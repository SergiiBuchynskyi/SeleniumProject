package com.cydeo.tests.day11_Actions_JS_Executor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Nazim_AmazonTask {

    @Test
    public void NazimTask1() {
        //open page
        Driver.getDriver().get("https://www.amazon.com.tr/");
        //accept cookies
        WebElement accept = Driver.getDriver().findElement(By.xpath("//input[@id='sp-cc-accept']"));
        WebElement searchBar = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        accept.click();

        //search Iphones
        searchBar.sendKeys("iPhone13 512"+ Keys.ENTER);
        List<WebElement> listOfIphones = new ArrayList<>();
        listOfIphones.addAll(Driver.getDriver().findElements(By.xpath("//span[contains(.,'Apple iPhone 13 ')]")));
        System.out.println("iPhones displayed " + listOfIphones.size()+ "pc");

        //click 1st result
        WebElement firstIphone = Driver.getDriver().findElement(By.xpath("(//span[contains(.,'Apple iPhone 13 ')])[2]"));
        firstIphone.click();

        //display data
        WebElement size = Driver.getDriver().findElement(By.xpath("//span[.=' 6.1 inç Super Retina XDR ekran  ']"));
        WebElement price = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-whole']"));
        WebElement color = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[2]"));
        WebElement stockStatus = Driver.getDriver().findElement(By.xpath("//div[@id='availability']/span"));

        System.out.println("size = " + size.getText());
        System.out.println("price = " + price.getText() + "TL");
        System.out.println("color = " + color.getText());
        System.out.println("stockStatus = " + stockStatus.getText());

        //close driver
        BrowserUtils.sleep(1);
       // Driver.quitDriver();
    }
}