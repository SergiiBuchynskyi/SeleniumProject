package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName) {
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDataCell = driver.findElement(By.xpath(locator));
        return customerDataCell.getText();
    }
    public static void orderVerification(WebDriver driver, String customerName,String expectedOrderDate) {
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDataCell = driver.findElement(By.xpath(locator));

        String actOrderDate = customerDataCell.getText();

        Assert.assertEquals(actOrderDate,expectedOrderDate);
    }


}
