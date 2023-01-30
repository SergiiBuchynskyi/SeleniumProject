package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadPractice {

    @Test
    public void upload_test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "C:\\Users\\buchi\\Desktop\\photo_2022-10-26_19-02-11.jpg";

        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(1);
        fileUpload.sendKeys(path);

        WebElement uploadBtn = Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();

        WebElement fileUploaderHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploaderHeader.isDisplayed());

    }


}
